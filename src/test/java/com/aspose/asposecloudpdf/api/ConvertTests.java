/**
 *
 * Copyright (c) 2026 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of TestHelper.getInstance() software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.aspose.asposecloudpdf.api;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.model.*;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConvertTests {
    private TestHelper th;

    public ConvertTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetPdfInStorageToDoc Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToDocTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);
        String folder = th.tempFolder;
        File response = th.pdfApi.getPdfInStorageToDoc(name, null, null, null, null, null, null, null, null, folder, null, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToDoc Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToDocTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);
        String folder = th.tempFolder;
        String resFileName = "result.doc";

        AsposeResponse response = th.pdfApi.putPdfInStorageToDoc(name, th.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, folder, null, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToDoc Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToDocTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.doc";

        AsposeResponse response = th.pdfApi.putPdfInRequestToDoc(th.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, null, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToPdfA Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToPdfATest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String type = PdfAType.PDFA1A.toString();
        String folder = th.tempFolder;

        File response = th.pdfApi.getPdfInStorageToPdfA(name, type, folder, null, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToPdfA Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToPdfATest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String type = PdfAType.PDFA1A.toString();
        String folder = th.tempFolder;
        String resFileName = "result.pdf";

        AsposeResponse response = th.pdfApi.putPdfInStorageToPdfA(name, th.tempFolder + '/' + resFileName, type, folder, null, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToPdfA Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToPdfATest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String type = PdfAType.PDFA1A.toString();
        String resFileName = "result.pdf";

        AsposeResponse response = th.pdfApi.putPdfInRequestToPdfA(th.tempFolder + '/' + resFileName, type, null, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToTiff Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToTiffTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;


        File response = th.pdfApi.getPdfInStorageToTiff(name, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToTiff Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToTiffTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String resFileName = "result.tiff";

        AsposeResponse response = th.pdfApi.putPdfInStorageToTiff(name, th.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToTiff Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToTiffTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.tiff";

        AsposeResponse response = th.pdfApi.putPdfInRequestToTiff(th.tempFolder + '/' + resFileName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToSvg Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToSvgTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);
        String folder = th.tempFolder;
        File response = th.pdfApi.getPdfInStorageToSvg(name, null, folder, null, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToSvg Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToSvgTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);
        String folder = th.tempFolder;
        String resFileName = "result.svg";
        AsposeResponse response = th.pdfApi.putPdfInStorageToSvg(name, th.tempFolder + '/' + resFileName, folder, null, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToSvg Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToSvgTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.svg";
        AsposeResponse response = th.pdfApi.putPdfInRequestToSvg(th.tempFolder + '/' + resFileName, null, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToXps Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToXpsTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;


        File response = th.pdfApi.getPdfInStorageToXps(name, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToXps Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToXpsTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String resFileName = "result.xps";

        AsposeResponse response = th.pdfApi.putPdfInStorageToXps(name, th.tempFolder + '/' + resFileName, folder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToXps Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToXpsTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.xps";

        AsposeResponse response = th.pdfApi.putPdfInRequestToXps(th.tempFolder + '/' + resFileName, null , file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToXls Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToXlsTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;


        File response = th.pdfApi.getPdfInStorageToXls(name, null, null, null, null, folder, null, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToXls Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToXlsTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String resFileName = "result.xls";

        AsposeResponse response = th.pdfApi.putPdfInStorageToXls(name, th.tempFolder + '/' + resFileName, null, null, null, null, folder, null, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToXls Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToXlsTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.xls";

        AsposeResponse response = th.pdfApi.putPdfInRequestToXls(th.tempFolder + '/' + resFileName, null, null, null, null, null, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToXlsx Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToXlsxTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);
        String folder = th.tempFolder;
        File response = th.pdfApi.getPdfInStorageToXlsx(name, null, null, null, null, folder, null, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToXlsx Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToXlsxTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);
        String folder = th.tempFolder;
        String resFileName = "result.xlsx";
        AsposeResponse response = th.pdfApi.putPdfInStorageToXlsx(name, th.tempFolder + '/' + resFileName, null, null, null, null, folder, null, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToXlsx Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPdfInRequestToXlsxTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.xlsx";
        AsposeResponse response = th.pdfApi.putPdfInRequestToXlsx(th.tempFolder + '/' + resFileName, null, null, null, null, null, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPdfToXlsx Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPdfToXlsxTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        File response = th.pdfApi.postPdfToXlsx(null, null, null, null, file);
        assertNotNull(response);
    }

    /**
     * GetPdfInStorageToHtml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToHtmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);
        String folder = th.tempFolder;
        File response = th.pdfApi.getPdfInStorageToHtml(name, null, null, null, null, null,  null,  null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder, null, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToHtml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToHtmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String resFileName = "result.html";

        AsposeResponse response = th.pdfApi.putPdfInStorageToHtml(
                name,
                th.tempFolder + '/' + resFileName,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                folder,
                null,
                null,
                OutputFormat.FOLDER.toString());
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToHtml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToHtmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.zip";

        AsposeResponse response = th.pdfApi.putPdfInRequestToHtml(
                th.tempFolder + '/' + resFileName,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToEpub Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToEpubTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;


        File response = th.pdfApi.getPdfInStorageToEpub(name, null, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToEpub Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToEpubTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String resFileName = "result.epub";

        AsposeResponse response = th.pdfApi.putPdfInStorageToEpub(name, th.tempFolder + '/' + resFileName, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToEpub Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToEpubTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.epub";

        AsposeResponse response = th.pdfApi.putPdfInRequestToEpub(th.tempFolder + '/' + resFileName, null, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToPptx Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToPptxTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);
        String folder = th.tempFolder;
        File response = th.pdfApi.getPdfInStorageToPptx(name, null, null, folder, null, null);
        assertNotNull(response);
    }

    /**
     * GetPdfInStorageToPptxWithPassword Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToPptxTestWithPassword() throws ApiException
    {
        String name = "4pagesEncrypted.pdf";
        th.uploadFile(name);
        String folder = th.tempFolder;
        String userPasswordBase64encoded = "dXNlciAkXlBhc3N3b3JkISY="; //user $^Password!&
        File response = th.pdfApi.getPdfInStorageToPptx(name, null, null, folder, null, userPasswordBase64encoded);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToPptx Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToPptxTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);
        String folder = th.tempFolder;
        String resFileName = "result.pptx";
        AsposeResponse response = th.pdfApi.putPdfInStorageToPptx(name, th.tempFolder + '/' + resFileName, null, null, folder, null, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInStorageToPptxWithPassword Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToPptxTestWithPassword() throws ApiException
    {
        String name = "4pagesEncrypted.pdf";
        th.uploadFile(name);
        String folder = th.tempFolder;
        String resFileName = "result.pptx";
        String userPasswordBase64encoded = "dXNlciAkXlBhc3N3b3JkISY="; //user $^Password!&
        AsposeResponse response = th.pdfApi.putPdfInStorageToPptx(name, th.tempFolder + '/' + resFileName, null, null, folder, null, userPasswordBase64encoded);
        assertEquals(200, (int)response.getCode());
    }

    /**
    * PutPdfInRequestToPptx Test
    * @throws ApiException
    *          if the Api call fails
    */

    @Test
    public void putPdfInRequestToPptxTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.pptx";
        AsposeResponse response = th.pdfApi.putPdfInRequestToPptx(th.tempFolder + '/' + resFileName, null, null, null, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToPptxWithPassword Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToPptxTestWithPassword() throws ApiException
    {
        String name = "4pagesEncrypted.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.pptx";
        String userPasswordBase64encoded = "dXNlciAkXlBhc3N3b3JkISY="; //user $^Password!&
        AsposeResponse response = th.pdfApi.putPdfInRequestToPptx(th.tempFolder + '/' + resFileName, null, null, null, userPasswordBase64encoded, file);
        assertEquals(200, (int)response.getCode());
    }
 
     /**
     * GetPdfInStorageToTeX Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToTeXTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;


        File response = th.pdfApi.getPdfInStorageToTeX(name, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToTeX Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToTeXTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String resFileName = "result.tex";

        AsposeResponse response = th.pdfApi.putPdfInStorageToTeX(name, th.tempFolder + '/' + resFileName, folder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToTeX Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToTeXTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.tex";

        AsposeResponse response = th.pdfApi.putPdfInRequestToTeX(th.tempFolder + '/' + resFileName, null, file);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPdfInStorageToMobiXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToMobiXmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;


        File response = th.pdfApi.getPdfInStorageToMobiXml(name, folder, null);
        assertNotNull(response);
    }


    /**
     * PutPdfInStorageToMobiXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToMobiXmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String resFileName = "result.mobi";

        AsposeResponse response = th.pdfApi.putPdfInStorageToMobiXml(name, th.tempFolder + '/' + resFileName, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutPdfInRequestToMobiXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToMobiXmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.mobi";

        AsposeResponse response = th.pdfApi.putPdfInRequestToMobiXml(th.tempFolder + '/' + resFileName, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToAps Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToApsTest() throws ApiException
    {
        String name = "5pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;


        File response = th.pdfApi.getPdfInStorageToAps(name, folder, null);
        assertNotNull(response);
    }


    /**
     * PutPdfInStorageToAps Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToApsTest() throws ApiException
    {
        String name = "5pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String resFileName = "result.xml";

        AsposeResponse response = th.pdfApi.putPdfInStorageToAps(name, th.tempFolder + '/' + resFileName, folder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutPdfInRequestToAps Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToApsTest() throws ApiException
    {
        String name = "5pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.xml";

        AsposeResponse response = th.pdfApi.putPdfInRequestToAps(th.tempFolder + '/' + resFileName, null, file);
        assertEquals(200, (int)response.getCode());
    }



    /**
     * GetXfaPdfInStorageToAcroForm Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getXfaPdfInStorageToAcroFormTest() throws ApiException
    {
        String name = "PdfWithXfaForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;


        File response = th.pdfApi.getXfaPdfInStorageToAcroForm(name, folder, null);
        assertNotNull(response);
    }

    /**
     * PutXfaPdfInStorageToAcroForm Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putXfaPdfInStorageToAcroFormTest() throws ApiException
    {
        String name = "PdfWithXfaForm.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String resFileName = "result.pdf";

        AsposeResponse response = th.pdfApi.putXfaPdfInStorageToAcroForm(name, th.tempFolder + '/' + resFileName, folder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutXfaPdfInRequestToAcroForm Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putXfaPdfInRequestToAcroFormTest() throws ApiException
    {
        String name = "PdfWithXfaForm.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.pdf";

        AsposeResponse response = th.pdfApi.putXfaPdfInRequestToAcroForm(th.tempFolder + '/' + resFileName, null, file);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPdfInStorageToXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPdfInStorageToXmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;


        File response = th.pdfApi.getPdfInStorageToXml(name, folder, null);
        assertNotNull(response);
    }

    /**
     * PutPdfInStorageToXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInStorageToXmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;
        String resFileName = "result.xml";

        AsposeResponse response = th.pdfApi.putPdfInStorageToXml(name, th.tempFolder + '/' + resFileName, folder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutPdfInRequestToXml Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfInRequestToXmlTest() throws ApiException
    {
        String name = "4pages.pdf";
        File file = new File(th.testDataFolder + "/" + name);
        String resFileName = "result.xml";

        AsposeResponse response = th.pdfApi.putPdfInRequestToXml(th.tempFolder + '/' + resFileName, null, file);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPdfInStorageToText Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfInStorageToTextTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);
        String folder = th.tempFolder;
        File response = th.pdfApi.getPdfInStorageToText(name, folder, null);
        assertNotNull(response);
    }
}
