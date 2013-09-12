package dataDriven

import spock.lang.*

class HelloSpockSpec extends spock.lang.Specification {

    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }

    @Unroll
    def "number of star trek troopers in generation #name is #size"() {
        expect:
        name.size() == size

        where:
        name     | size
        "The Original Series"  | 19
        "The Animated Series"   | 19
        "The Next Generation" | 19
        "Deep Space Nine"  | 15
    }
}
