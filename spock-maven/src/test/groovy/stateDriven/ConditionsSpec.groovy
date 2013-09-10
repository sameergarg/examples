package stateDriven

import spock.lang.Specification

class ConditionsSpec extends Specification {

    def "when-then style"() {
        when:
        def x = Math.max(5, 9)

        then:
        x == 9
    }

    /**
     * An expect block is more limited than a then block in that it may only contain conditions and variable definitions.
     * It is useful in situations where it is more natural to describe stimulus and expected response in a single
     * expression.
     */
    def "expect style"() {
        expect:
        Math.max(5, 9) == 9
    }

    def "more complex conditions"() {
        expect:
        germanCarBrands.any { it.size() >= 3 }
    }

    private getGermanCarBrands() { ["audi", "bmw", "porsche"] }
}
