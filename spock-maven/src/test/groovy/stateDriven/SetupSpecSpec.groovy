package stateDriven

import spock.lang.Specification

class SetupSpecSpec extends Specification {
    File file

    def setup() {
        file = new File("foo2.txt")
    }

    def "a file based test"() {
        when:
        file.createNewFile()

        then:
        file.exists()
    }

    def "by now the object is not null"() {
        expect: file.exists()
        cleanup: file.delete()
    }
}
