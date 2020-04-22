package utils.annotations.namePageAnalyzers;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import utils.annotations.PageName;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;

public class NamePageAnalyzer {
    public static Map<String, Class<?>> mapNameClasses = new HashMap<>();

    public void creatorMapClass() {
        try {
            for ( Class<?> clazz : new NamePageAnalyzer().collectorClassesWithAnnotationPageName()) {
                mapNameClasses.put(clazz.getAnnotation(PageName.class).value(), clazz);
            }
        } catch (Exception e) {
                System.out.println("Страница с таким именем не найдена. ПОДРОБНАЯ ОШИБКА: "+e);
        }
    }

    public static Class<?> getClass(String namePage) {
        return mapNameClasses.get(namePage);
    }

    public Set<Class<?>> collectorClassesWithAnnotationPageName() {
        Reflections reflections = new Reflections(new ConfigurationBuilder()
                .setUrls(ClasspathHelper.forPackage("pages"))
                .setScanners(new SubTypesScanner(), new TypeAnnotationsScanner())
                .setExecutorService(Executors.newFixedThreadPool(4)));
        return reflections.getTypesAnnotatedWith(PageName.class);
    }

}
