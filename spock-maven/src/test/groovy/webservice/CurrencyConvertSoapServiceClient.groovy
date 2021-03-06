package webservice

import spock.lang.Specification
import wslite.soap.SOAPClient
import spock.lang.Unroll

/**
 *
 * User: sameer
 * Date: 24/10/2013
 * Time: 10:00
 */
/*
        POST /CurrencyConvertor.asmx HTTP/1.1
Host: www.webservicex.net
Content-Type: application/soap+xml; charset=utf-8
Content-Length: length

<?xml version="1.0" encoding="utf-8"?>
<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
  <soap12:Body>
    <ConversionRate xmlns="http://www.webserviceX.NET/">
      <FromCurrency>AFA or ALL or DZD or ARS or AWG or AUD or BSD or BHD or BDT or BBD or BZD or BMD or BTN or BOB or BWP or BRL or GBP or BND or BIF or XOF or XAF or KHR or CAD or CVE or KYD or CLP or CNY or COP or KMF or CRC or HRK or CUP or CYP or CZK or DKK or DJF or DOP or XCD or EGP or SVC or EEK or ETB or EUR or FKP or GMD or GHC or GIP or XAU or GTQ or GNF or GYD or HTG or HNL or HKD or HUF or ISK or INR or IDR or IQD or ILS or JMD or JPY or JOD or KZT or KES or KRW or KWD or LAK or LVL or LBP or LSL or LRD or LYD or LTL or MOP or MKD or MGF or MWK or MYR or MVR or MTL or MRO or MUR or MXN or MDL or MNT or MAD or MZM or MMK or NAD or NPR or ANG or NZD or NIO or NGN or KPW or NOK or OMR or XPF or PKR or XPD or PAB or PGK or PYG or PEN or PHP or XPT or PLN or QAR or ROL or RUB or WST or STD or SAR or SCR or SLL or XAG or SGD or SKK or SIT or SBD or SOS or ZAR or LKR or SHP or SDD or SRG or SZL or SEK or CHF or SYP or TWD or TZS or THB or TOP or TTD or TND or TRL or USD or AED or UGX or UAH or UYU or VUV or VEB or VND or YER or YUM or ZMK or ZWD or TRY</FromCurrency>
      <ToCurrency>AFA or ALL or DZD or ARS or AWG or AUD or BSD or BHD or BDT or BBD or BZD or BMD or BTN or BOB or BWP or BRL or GBP or BND or BIF or XOF or XAF or KHR or CAD or CVE or KYD or CLP or CNY or COP or KMF or CRC or HRK or CUP or CYP or CZK or DKK or DJF or DOP or XCD or EGP or SVC or EEK or ETB or EUR or FKP or GMD or GHC or GIP or XAU or GTQ or GNF or GYD or HTG or HNL or HKD or HUF or ISK or INR or IDR or IQD or ILS or JMD or JPY or JOD or KZT or KES or KRW or KWD or LAK or LVL or LBP or LSL or LRD or LYD or LTL or MOP or MKD or MGF or MWK or MYR or MVR or MTL or MRO or MUR or MXN or MDL or MNT or MAD or MZM or MMK or NAD or NPR or ANG or NZD or NIO or NGN or KPW or NOK or OMR or XPF or PKR or XPD or PAB or PGK or PYG or PEN or PHP or XPT or PLN or QAR or ROL or RUB or WST or STD or SAR or SCR or SLL or XAG or SGD or SKK or SIT or SBD or SOS or ZAR or LKR or SHP or SDD or SRG or SZL or SEK or CHF or SYP or TWD or TZS or THB or TOP or TTD or TND or TRL or USD or AED or UGX or UAH or UYU or VUV or VEB or VND or YER or YUM or ZMK or ZWD or TRY</ToCurrency>
    </ConversionRate>
  </soap12:Body>
</soap12:Envelope>
HTTP/1.1 200 OK
Content-Type: application/soap+xml; charset=utf-8
Content-Length: length

<?xml version="1.0" encoding="utf-8"?>
<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
  <soap12:Body>
    <ConversionRateResponse xmlns="http://www.webserviceX.NET/">
      <ConversionRateResult>double</ConversionRateResult>
    </ConversionRateResponse>
  </soap12:Body>
</soap12:Envelope>
        */
class CurrencyConvertSoapServiceClient extends Specification {

    @Unroll
    def "#fromCurrency can be converted to #toCurrency"() {

        given:
        def client = new SOAPClient('http://www.webservicex.net/CurrencyConvertor.asmx')

        when:
        def response = client.send(SOAPAction: 'http://www.webserviceX.NET/ConversionRate') {
            body {
                ConversionRate('xmlns': 'http://www.webserviceX.NET/') {
                    FromCurrency(fromCurrency)
                    ToCurrency(toCurrency)
                }


            }
        }

        then:
        1.6 < response.ConversionRateResponse.ConversionRateResult.text().toBigDecimal()

        where:
        fromCurrency|toCurrency
        "GBP"|"USD"

    }


}
