
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;


public class Fatura 
{
    public static void main(String[] args) throws Exception
    {
        String ad = "Emir Civas";
        String adr = "Yildiz Is Hani Barbaros Bl. Besiktas / Istanbul";
        
        File f = new File("fatura.pdf");
        FileOutputStream fos = new FileOutputStream(f);
        
        Document doc = new Document();
        
        PdfWriter.getInstance(doc, fos);
        
        doc.open();
        
        PdfPTable tbl = new PdfPTable(new float[] { 1, 2, 3 });
        Image logo = Image.getInstance(new URL("https://upload.wikimedia.org/wikipedia/commons/6/67/Crystal_java.png"));
        tbl.addCell(logo);
        
        PdfPCell c = new PdfPCell();
        c.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        c.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
        c.addElement(new Phrase(ad));
        
        tbl.addCell(c);
        c.addElement(new Phrase(adr));
        tbl.addCell(c);
        
        doc.add(tbl);
        doc.close();
        
    }
}
