package to.currie.easystart;

import org.apache.commons.lang.WordUtils;

/**
 * Mangles strings for display.
 *
 * @author hamish
 *
 */
public class Mangler {

    /**
     * Mangle a String.
     * @param message the String to be mangled.
     * @return the String
     */
    public String mangle(String message) {
        return WordUtils.capitalizeFully(message);
    }
}
