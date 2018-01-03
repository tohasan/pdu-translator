package org.tohasan.pduxml.lib

import org.tohasan.pduxml.AppRunner
import spock.lang.Specification

import static XmlPduTranslator.pduToXml

/**
 * author: IgorKaSan 
 * date: 01.01.2018.
 */
class XmlPduTranslatorSpec extends Specification {

    def "read response"() {
        given:
        byte[] bytes = AppRunner.hexStringToByteArray(
                "0C01020000016401000155021D090C07E10418010E0120FF800000120420110112000" +
                        "0150000000000000000150000000000000000150000000000000000150000000000000000" +
                        "150000000000000000150000000000000000150000000000000000150000000000000000"
        )

        expect:
        def expected = '''<ReadResponse Qty="01" >
  <DataBlockResult>
    <LastBlock Value="00" />
    <BlockNumber Value="0001" />
    <RawData Value="01000155021D090C07E10418010E0120FF8000001204201101120000150000000000000000150000000000000000150000000000000000150000000000000000150000000000000000150000000000000000150000000000000000150000000000000000" />
  </DataBlockResult>
</ReadResponse>
'''.replaceAll("\\n", "\r\n")
        pduToXml(bytes).toString() == expected
    }

    def "read request parametrized access"() {
        given:
        byte[] bytes = AppRunner.hexStringToByteArray(
                "050104C008010204020412000809060000010000FF0F02120000090C07DA041E050E2522618000FF090CFFFFFFFFFFFFFFFFFF8000FF0100"
        )
        
        expect:
        def expected = '''<ReadRequest Qty="01" >
  <ParameterisedAccess>
    <VariableName Value="C008" />
    <Selector Value="01" />
    <Parameter>
      <Structure Qty="04" >
        <Structure Qty="04" >
          <LongUnsigned Value="0008" />
          <OctetString Value="0000010000FF" />
          <Integer Value="02" />
          <LongUnsigned Value="0000" />
        </Structure>
        <OctetString Value="07DA041E050E2522618000FF" />
        <OctetString Value="FFFFFFFFFFFFFFFFFF8000FF" />
        <Array Qty="00" >
        </Array>
      </Structure>
    </Parameter>
  </ParameterisedAccess>
</ReadRequest>
'''.replaceAll("\\n", "\r\n")
        pduToXml(bytes).toString() == expected
    }
}
