import geb.spock.GebSpec

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
}