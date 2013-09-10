package stateDriven

import spock.lang.Specification

class AccountSpec extends Specification {

    def "withdraw some amount"() {
        given:
        Account account = new Account(BigDecimal.valueOf(5));

        when:
        account.withdraw(BigDecimal.valueOf(2));

        then:
        account.getBalance() == BigDecimal.valueOf(3);
    }

    def "withdraw some amount swiftly"() {
        given:
        def account = new Account(5.0)

        when:
        account.withdraw(2.0)

        then:
        account.balance == 3.0
    }

    //with documentation blocks
    def "withdraw some amount and provide spec docs"() {
        given: "an account with a balance of five euros"
        def account = new Account(5.0)

        when: "two euros are withdrawn"
        account.withdraw(2.0)

        then: "three euros remain in the account"
        account.balance == 3.0
    }

    def "can't withdraw a negative amount"() {
        given:
        def account = new Account(5.0)

        when:
        account.withdraw(-1.0)

        then:
        NegativeAmountWithdrawnException e = thrown()
        e.amount == -1.0
    }

    def "withdrawing some amount decreases the balance by exactly that amount"() {
        def account = new Account(5.0)

        when:
        account.withdraw(2.0)

        then:
        account.balance == old(account.balance) - 2.0
    }

}
