package in.bonakula.pdf;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class HtmlToPdf {
    public static void main(String...a){
    	String htmlText = getHtmlText();
        generatePDFFromHTML(htmlText);
    }
    
    private static void generatePDFFromHTML(String text) {
        Document document = new Document();
        PdfWriter writer = null;
        try {
            File file = new File("html.pdf");
            writer = PdfWriter.getInstance(document,
                    new FileOutputStream(file.toString()));
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        document.open();
        try {
        	
        	InputStream stringStream = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
            XMLWorkerHelper.getInstance().parseXHtml(writer, document,stringStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        document.close();
    }

    private static String getHtmlText() {
    	return "<html>\n" +
				"\t<head>\n" +
				"\t</head>\n" +
				"\t<body bgcolor=\"#ffffff\">\n" +
				"\t<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#ffffff\">\n" +
				"\t\t<tr>\n" +
				"\t\t\t<td>&nbsp;</td>\n" +
				"\t\t</tr>\n" +
				"\t\t<tr>\n" +
				"\t\t\t<td align=\"center\" valign=\"top\">\n" +
				"\t\t\t\t<table width=\"620\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#fff\">\n" +
				"\t\t\t\t\t<tr>\n" +
				"\t\t\t\t\t\t<td align=\"center\" valign=\"top\" bgcolor=\"#FFFFFF\">\n" +
				"\t\t\t\t\t\t\t<table width=\"620\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\">\n" +
				"\t\t\t\t\t\t\t\t<tr>\n" +
				"\t\t\t\t\t\t\t\t\t<td valign=\"middle\">&nbsp;</td>\n" +
				"\t\t\t\t\t\t\t\t</tr>\n" +
				"\t\t\t\t\t\t\t\t<tr>\n" +
				"                                   <td valign=\"middle\" colspan=\"3\">\n" +
				"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
				"\t\t\t\t\t\t\t\t\t <table>\n" +
				"                                        <tr>\n" +
				"                                          <td align=\"left\" valign=\"middle\" style=\"width:100px\">\n" +
				"                                            <img src=\"https://localhost:9001/de-de/_ui/responsive/theme-alpha/images/molicareLogoMail.png\" width=\"93\" height=\"16\" border=\"0\"/>\n" +
				"                                           </td>\n" +
				"                                           <td align=\"right\" valign=\"middle\" style=\"width:500px\">\n" +
				"                                               <table>\n" +
				"                                                   <tr>\n" +
				"                                                   <td height=\"35px\" valign=\"middle\">\n" +
				"                                                    <a style=\"text-decoration:none\" href=\"https://localhost:9002/de-de/my-account/address-book\"><font color=\"#323e48\" size=\"2\" face=\"Arial, Helvetica, sans-serif\"><b>Mein Konto</b></font></a>&nbsp;&nbsp;\n" +
				"                                                   </td>\n" +
				"                                                   <td height=\"35px\" valign=\"middle\">\n" +
				"                                                       &nbsp;&nbsp;<a style=\"text-decoration:none\" href=\"https://localhost:9001/de-de/molicare/service-request\"><font color=\"#323e48\" size=\"2\" face=\"Arial, Helvetica, sans-serif\"><b>Hilfe</b></font></a>&nbsp;&nbsp;\n" +
				"                                                   </td>\n" +
				"                                                   <td width=\"1px\" style=\"border:0.5px solid #989ea3;\" bgcolor=\"#989ea3\" height=\"50px\">\n" +
				"                                                   </td>\n" +
				"                                                   <td height=\"35px\" valign=\"middle\">\n" +
				"                                                       &nbsp;&nbsp;<img src=\"https://localhost:9001/de-de/_ui/responsive/theme-alpha/images/hartmannLogoMail.png\" width=\"68\" height=\"35\" border=\"0\"/>\n" +
				"                                                   </td>\n" +
				"                                             \t</tr>\n" +
				"                                     \t\t </table>\n" +
				"                                  \t\t\t</td>\n" +
				"    \t                      \t\t\t</tr>\n" +
				"                          \t\t\t\t</table>\n" +
				"                       \t\t \t\t</td>\n" +
				"                    \t\t\t</tr>\n" +
				"\t\t\t\t\t\t\t\t<tr>\n" +
				"                            \t  <td colspan=\"3\" height=\"70\" align=\"left\" valign=\"middle\" width=\"100%\" border=\"1\">\n" +
				"                            \t  \t<table width=\"100%\" background=\"https://localhost:9001/de-de/_ui/responsive/theme-alpha/images/headerMail.png\">\n" +
				"                            \t  \t\t<tr>\n" +
				"                            \t  \t\t\t<td style=\"padding-left:15px;\" height=\"70\" valign=\"middle\">\n" +
				"                              \t\t\t\t\t<font color=\"#FFFFFF\" size=\"3\" face=\"Arial, Helvetica, sans-serif\"><b>Bitte schließen Sie die Registrierung für Ihr MoliCare® Kundenkonto ab</b></font>\n" +
				"                              \t\t\t\t</td>\n" +
				"                              \t\t\t</tr>\n" +
				"                              \t\t</table>\n" +
				"                              \t   </td>\n" +
				"                            \t</tr>\n" +
				"\t\t\t\t\t\t\t\t<tr>\n" +
				"\t\t\t\t\t\t\t\t\t<td colspan=\"3\" align=\"center\" valign=\"middle\">\n" +
				"\t\t\t\t\t\t\t\t\t\t<a href=\"https://localhost:9001/de-de\" style=\"display:block; margin-top:10px;margin-bottom:10px;\"></a>\n" +
				"\t\t\t\t\t\t\t\t\t</td>\n" +
				"\t\t\t\t\t\t\t\t</tr>\n" +
				"\t\t\t\t\t\t\t\t<tr>\n" +
				"\t\t\t\t\t\t\t\t\t<td colspan=\"3\">&nbsp;</td>\n" +
				"\t\t\t\t\t\t\t\t</tr>\n" +
				"\t\t\t\t\t\t\t\t<tr>\n" +
				"\t\t\t\t\t\t\t\t\t<td colspan=\"3\" align=\"left\" valign=\"top\">\n" +
				"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><font color=\"#666666\" size=\"2\" face=\"Arial, Helvetica, sans-serif\"><b>Sehr geehrte Frau bonakula</b>,</font></p>\n" +
				"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><font color=\"#666666\" size=\"2\" face=\"Arial, Helvetica, sans-serif\">vielen Dank für Ihre Registrierung auf der Website von MoliCare<sup>®</sup>. Um Ihr Kundenkonto in vollem Umfang nutzen zu können, bestätigen Sie bitte nachfolgend Ihre E-Mail-Adresse. Nur so können wir sichergehen, dass Ihre E-Mail-Adresse nicht unerlaubt von Dritten genutzt wurde.</font></p>\n" +
				"\t\t\t\t\t\t\t\t\t</td>\n" +
				"\t\t\t\t\t\t\t\t</tr>\n" +
				"\t\t\t\t\t\t\t\t<tr>\n" +
				"                                   <td colspan=\"3\">&nbsp;</td>\n" +
				"                                </tr>\n" +
				"                              \t<tr>\n" +
				"                              \t<td style=\"width:185px\"></td>\n" +
				"                              \t<td width=\"120\" href=\"https://localhost:9002/de-de/registeruser/confirm?isPrescReg=false&token=nw%2F3r34dUbk%2Fajp7tULSflyevzPOv5uZiFMdK7lkD%2FWqEZG3HmALfVEAYrA3s4%2F0gTfo8RRaCIZPJ8jrgV53%2BJClDoGz6vJ5bMkz1DpYNEjJaRCq6fAHsZw5mtd61j8%2BphUj1DN0pPnkhEb5snPV5Q%3D%3D\" style=\"font-family:Arial, Helvetica, sans-serif;height:30px;background-color:#00bd71;text-align:center;border:1px solid #000;width:200px;cursor:pointer\">\n" +
				"                                   <center><a style=\"text-decoration:none;color:#fff;height:30px;width:200px;font-family:Arial, Helvetica, sans-serif;\" href=\"https://localhost:9002/de-de/registeruser/confirm?isPrescReg=false&token=nw%2F3r34dUbk%2Fajp7tULSflyevzPOv5uZiFMdK7lkD%2FWqEZG3HmALfVEAYrA3s4%2F0gTfo8RRaCIZPJ8jrgV53%2BJClDoGz6vJ5bMkz1DpYNEjJaRCq6fAHsZw5mtd61j8%2BphUj1DN0pPnkhEb5snPV5Q%3D%3D\">Registrierung bestätigen</a></center>\n" +
				"                                </td>\n" +
				"                                <td style=\"width:185px\"></td>\n" +
				"                                </tr>\n" +
				"                                <tr>\n" +
				"                                  <td colspan=\"3\">&nbsp;</td>\n" +
				"                                </tr>\n" +
				"                                 <tr>\n" +
				"\t\t\t\t\t\t\t\t\t<td colspan=\"3\" align=\"left\" valign=\"top\">                      \n" +
				"\t\t\t\t\t\t\t\t\t\t<p><font color=\"#666666\" size=\"2\" face=\"Arial, Helvetica, sans-serif\"><b>Bitte beachten Sie, dass diese E-Mail aus Sicherheitsgründen ihre Gültigkeit nach 24 Stunden verliert.</b></font></p>\n" +
				"\t\t\t\t\t\t\t\t\t\t<p><font color=\"#666666\" size=\"2\" face=\"Arial, Helvetica, sans-serif\">Ihr MoliCare<sup>®</sup> Team</font></p>\n" +
				"\t\t\t\t\t\t\t\t\t</td>\n" +
				"\t\t\t\t\t\t\t\t</tr>\n" +
				"\t\t\t\t\t\t\t\t<tr>\n" +
				"\t\t\t\t\t\t\t\t\t<td colspan=\"3\">&nbsp;</td>\n" +
				"\t\t\t\t\t\t\t\t</tr>\n" +
				"\t\t\t\t\t\t\t\t<tr>\n" +
				"\t\t\t\t\t\t\t\t\t<td colspan=\"3\" align=\"center\" valign=\"middle\">\n" +
				"\t\t\t\t\t\t\t\t\t\t<a href=\"https://localhost:9001/de-de\" style=\"display:block; margin-top:10px;margin-bottom:10px;\"></a>\n" +
				"\t\t\t\t\t\t\t\t\t</td>\n" +
				"\t\t\t\t\t\t\t\t</tr>\n" +
				"\t\t\t\t\t\t\t\t<tr>\n" +
				"                                  <td colspan=\"1\" height=\"30\" align=\"left\" valign=\"middle\" bgcolor=\"#00bd71\" style=\"padding-left:5px;width:200px;\">\n" +
				"                                    <font color=\"#FFFFFF\" size=\"2\" face=\"Arial, Helvetica, sans-serif\">&copy;2019 PAUL HARTMANN AG</font>\n" +
				"                                  </td>\n" +
				"                                  <td colspan=\"2\" height=\"30\" align=\"right\" valign=\"middle\" bgcolor=\"#00bd71\">\n" +
				"                                    <font color=\"#FFFFFF\" size=\"2\" face=\"Arial, Helvetica, sans-serif\"><a href=\"https://localhost:9001/de-de/molicare/service-request\"><font color=\"#FFFFFF\">Hilfe</font></a> | <a href=\"https://localhost:9001/de-de/molicare?source=termsAndCond\"><font color=\"#FFFFFF\">Allgemeine Geschäftsbedingungen</font></a> | <a href=\"https://hartmann.info/de-de/datenschutz\"><font color=\"#FFFFFF\">Datenschutzerklärung</font></a> &nbsp;&nbsp;</font>\n" +
				"                                  </td>\n" +
				"                                </tr>\n" +
				"                                <tr>\n" +
				"                                 <td colspan=\"3\">&nbsp;</td>\n" +
				"                                </tr>\n" +
				"\t\t\t\t\t\t\t\t<tr>\n" +
				"\t\t\t\t\t\t\t\t\t<td>&nbsp;</td>\n" +
				"\t\t\t\t\t\t\t\t</tr>\n" +
				"\t\t\t\t\t\t\t</table>\n" +
				"\t\t\t\t\t\t</td>\n" +
				"\t\t\t\t\t</tr>\n" +
				"\t\t\t\t</table>\n" +
				"\t\t\t</td>\n" +
				"\t\t</tr>\n" +
				"\t\t<tr>\n" +
				"\t\t\t<td>&nbsp;</td>\n" +
				"\t\t</tr>\n" +
				"\t</table>\n" +
				"</body>\n" +
				"</html>\n" +
				"\n";
	}

	
}
