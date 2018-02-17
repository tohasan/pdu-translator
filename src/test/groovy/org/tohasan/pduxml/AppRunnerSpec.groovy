package org.tohasan.pduxml

import spock.lang.Specification

import static org.tohasan.pduxml.lib.XmlPduTranslator.pduToXml

/**
 * author: IgorKaSan 
 * date: 17.02.2018.
 */
class AppRunnerSpec extends Specification {

    def "should process input space separated string successfully"(){
        given:
        String[] inputArgs = ["05 01 02 CF 08"]

        when:
        AppRunner.main(inputArgs)

        then:
        noExceptionThrown()
    }

}
