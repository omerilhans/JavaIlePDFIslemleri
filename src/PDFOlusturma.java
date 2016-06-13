
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;

public class PDFOlusturma 
{
    public static void main(String[] args) throws Exception
    {
        File pdfFile = new File("output.pdf");
        FileOutputStream fos = new FileOutputStream(pdfFile);
        // 1 - PDF Document Olustur
        Document doc = new Document();
        
        
        // 2 - PDFYazici Sınıfı Olustur
        PdfWriter.getInstance(doc, fos);
        
        // 3 - Dokumani Ac Veriyi Yaz
        doc.open();
        
        doc.addAuthor("Emir Civaş");
        doc.addCreator("Dell Bilgisayarım :)");
        doc.addKeywords("IText, Java, PDF, Örnek, Ömer");
        doc.addSubject("Konu Yok");
        doc.addTitle("Başlık Yok");
        
        for (int i = 0; i<20; i++)
        {
            for (int j = 0; j<10; j++)
            {
                String satir = ""+Math.random();
                Paragraph p = new Paragraph(satir);
                doc.add(p);
            }
            
            // PDF'e Yeni Sayfa
            doc.newPage();
            
            
        }
        
        // 4 - PDF'i Kaydet & Kapat
            doc.close();
    }
}
