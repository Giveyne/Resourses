import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main {
        public static void main(String[] args) throws UnsupportedEncodingException {
// По дефолту начитнает с языкового пакета той страны которой установлена система начиная со country>language>default
// проверяет вначале resource_en_GB
// затем  resource_en и если не находит нитого ни того берет resource(дефолтный)
            // ресурс пак из ResourcesBundle (принимает только String ключ String)
    ResourceBundle bundleDef = ResourceBundle.getBundle("resources");
    ResourceBundle bundleRussia = ResourceBundle.getBundle("resources", new Locale("ru", "RU"));
    ResourceBundle bundleGermany = ResourceBundle.getBundle("resources", new Locale("de", "Gr"));
    ResourceBundle bundleFrench = ResourceBundle.getBundle("resources", new Locale("fr"));
    ResourceBundle bundleEngland = ResourceBundle.getBundle("resources", new Locale("en"));
        System.out.println(bundleDef.getString("somevalue"));
        System.out.println(bundleRussia.getString("somevalue"));
        System.out.println(bundleGermany.getString("somevalue"));
        System.out.println(bundleFrench.getString("somevalue"));
        System.out.println(bundleEngland.getString("somevalue"));
            // Это через классы наследники ListResourcesBundle (может принимать ключи String и обьекты любых типов)
            ResourceBundle bundleDefoult = ResourceBundle.getBundle("resources.resource");
            ResourceBundle bundleEn = ResourceBundle.getBundle("resources.resource", new Locale("en", "GB"));
            ResourceBundle bundleDe = ResourceBundle.getBundle("resources.resource", new Locale("de", "GR"));
            ResourceBundle bundleFR = ResourceBundle.getBundle("resources.resource", new Locale("fr"));
            ResourceBundle bundleRu = ResourceBundle.getBundle("resources.resource", new Locale("ru"));
            System.out.println(new String(bundleDefoult.getString("somevalue").getBytes("UTF-8"), "UTF-8"));
            System.out.println(bundleEn.getString("somevalue"));
            System.out.println(bundleDe.getString("somevalue"));
            System.out.println(bundleFR.getString("somevalue"));
            System.out.println(bundleRu.getString("somevalue"));
            System.out.println(bundleDefoult.getString("somevalue"));
        }
    }