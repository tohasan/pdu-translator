package org.tohasan.pduxml;


import org.tohasan.pduxml.lib.exceptions.XmlPduException;
import org.tohasan.pduxml.lib.utils.Preprocessor;

import static org.tohasan.pduxml.lib.XmlPduTranslator.pduToXml;

/**
 * author: IgorKaSan
 * date: 17.12.2017.
 */
public class AppRunner {

    public static void main(String[] args) throws XmlPduException {
//        byte[] bytes = new byte[] {0x05, 0x01, 0x02, (byte)0xCF, 0x08};
        // byte[] bytes = hexStringToByteArray(args[0]);

        Preprocessor preprocessor = new Preprocessor(args[0]);
/*        byte[] bytes =
                hexStringToByteArray(
                "0C01020000016401000155021D090C07E10418010E0120FF800000120420110112000" +
                        "0150000000000000000150000000000000000150000000000000000150000000000000000" +
                        "150000000000000000150000000000000000150000000000000000150000000000000000"
        );
*/
        byte[] bytes = preprocessor.getBytes();
        System.out.println(pduToXml(bytes));
    }

}
