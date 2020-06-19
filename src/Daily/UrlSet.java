package Daily;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

/**
 * @author grady
 * @date 20-6-18 下午3:38
 */
public class UrlSet {

    private static final String[] URI_NAMES = {
            "http://javapuzzlers.com",
            "http://apache2-snort.skybar.dreamhost.com",
            "http://www.google.com",
            "http://javapuzzlers.com",
            "http://findbugs.sourceforge.net",
            "http://www.cs.umd.edu"
    };

    public static void main(String[] args) throws URISyntaxException, MalformedURLException {

        Set<URI> favorites = new HashSet<URI>();
        for (String uriName : URI_NAMES)
            favorites.add(new URI(uriName));
        System.out.println(favorites.size());
    }
}
