/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomauricio.Visao;

import Objetos.Operacao;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import projetomauricio.DAO.BuscaRelatorio;

/**
 *
 * @author Lucas
 */
public class teste {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        List<Operacao> operacoes = new ArrayList<>();
        BuscaRelatorio dao = new BuscaRelatorio();
        Date inicial = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        inicial = df.parse("2009/10/20");
        Date fim = new Date();
        fim = df.parse("2016/05/16");
        operacoes = dao.Relatorio(8, inicial, fim);
        for(Operacao operacoe : operacoes) {
            System.out.println(operacoe.getId());
        }
        

    }

    public void geraPDF() throws FileNotFoundException {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\LocalPDF/PDF_DevMedia.pdf"));
            document.open();
            document.add(new Paragraph("Gerando PDF em Java - metadados"));
            document.addSubject("Gerando PDF em Java");
            document.addKeywords("www.devmedia.com.br");
            document.addCreator("iText");
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        }
        document.close();
    }
}
