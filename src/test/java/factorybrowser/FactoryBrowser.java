package factorybrowser;

import java.util.HashMap;
import java.util.Map;

public class FactoryBrowser {
    public static IBrowser make(String browser){
        Map<String, IBrowser> browserMap = new HashMap<>();
        browserMap.put("chrome", new Chrome());
        browserMap.put("firefox", new Firefox());
        browserMap.put("chromeproxy", new ChromeProxy());

        return browserMap.containsKey(browser.toLowerCase()) ? browserMap.get(browser) : browserMap.get("chrome");
    }
}
