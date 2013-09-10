package stateDriven

import spock.lang.Shared
import spock.lang.Specification


class SharedFieldSpec extends Specification {
    @Shared File file

    def "a file based test"() {
        when:
        file = new File("foo.txt")
        file.createNewFile()

        then:
        file.exists()
    }

    def "by now the object is not null"() {
        expect:
        file.exists()

        cleanup:
        file.delete()
    }
}
