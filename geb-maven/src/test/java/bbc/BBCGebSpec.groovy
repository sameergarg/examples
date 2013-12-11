package bbc

import geb.Browser
import geb.spock.GebSpec
import org.openqa.selenium.htmlunit.HtmlUnitDriver

/**
 *
 * User: sameer
 * Date: 11/12/2013
 * Time: 14:38
 */
class BBCGebSpec extends GebSpec {


    def "go to login"() {
        when:
        browser.go "http://www.bbc.co.uk"

        then:
        browser.page.title == "BBC - Homepage"
    }

    /**
     * Override configuration inside GebConfig
     * @return
     */
    @Override
    Browser createBrowser() {
        return new Browser(driver: new HtmlUnitDriver())
    }
}