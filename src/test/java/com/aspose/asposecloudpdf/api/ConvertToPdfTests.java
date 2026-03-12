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
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConvertToPdfTests {
    private TestHelper th;

    public ConvertToPdfTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetEpubInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getEpubInStorageToPdfTest() throws ApiException
    {
        String name = "4pages.epub";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getEpubInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutEpubInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putEpubInStorageToPdfTest() throws ApiException
    {
        String name = "4pages.epub";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;
        String resultName = "fromEpub.pdf";

        AsposeResponse response = th.pdfApi.putEpubInStorageToPdf(resultName, srcPath, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetWebInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getWebInStorageToPdfTest() throws ApiException
    {
        String sourceUrl = "http://google.com";

        File response = th.pdfApi.getWebInStorageToPdf(sourceUrl, null, null , null,
                null, null, null, null, null);
        assertNotNull(response);
    }


    /**
     * PutWebInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putWebInStorageToPdfTest() throws ApiException
    {
        String sourceUrl = "http://google.com";
        String resultName = "fromWeb.pdf";

        AsposeResponse response = th.pdfApi.putWebInStorageToPdf(resultName, sourceUrl, null,
                null, null, null, null, null,
                null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetTeXInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getTeXInStorageToPdfTest() throws ApiException
    {
        String name = "sample.tex";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getTeXInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutTeXInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putTeXInStorageToPdfTest() throws ApiException
    {
        String name = "sample.tex";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;
        String resultName = "fromTex.pdf";

        AsposeResponse response = th.pdfApi.putTeXInStorageToPdf(resultName, srcPath, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetMhtInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getMhtInStorageToPdfTest() throws ApiException
    {
        String name = "MhtExample.mht";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getMhtInStorageToPdf(srcPath, null, null, null, null, null, null, null);
        assertNotNull(response);
    }


    /**
     * PutMhtInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putMhtInStorageToPdfTest() throws ApiException
    {
        String name = "MhtExample.mht";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;
        String resultName = "fromMht.pdf";

        AsposeResponse response = th.pdfApi.putMhtInStorageToPdf(resultName, srcPath, null, null, null, null, null, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetHtmlInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getHtmlInStorageToPdfTest() throws ApiException
    {
        String name = "HtmlWithImage.zip";
        th.uploadFile(name);

        String htmlFileName = "HtmlWithImage.html";
        double height = 650;
        double width = 250;
        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getHtmlInStorageToPdf(srcPath, htmlFileName, height, width,
                null, null, null, null, null, null);
        assertNotNull(response);
    }


    /**
     * PutHtmlInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putHtmlInStorageToPdfTest() throws ApiException
    {
        String name = "HtmlWithImage.zip";
        th.uploadFile(name);

        String htmlFileName = "HtmlWithImage.html";
        double height = 650;
        double width = 250;
        String resultName = "fromHtml.pdf";
        String srcPath = th.tempFolder + '/' + name;


        AsposeResponse response = th.pdfApi.putHtmlInStorageToPdf(name, srcPath, htmlFileName,
                height, width, null, null, null,
                null, null, null, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetXslFoInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getXslFoInStorageToPdfTest() throws ApiException
    {
        String name = "XslfoExample.xslfo";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getXslFoInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutXslFoInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putXslFoInStorageToPdfTest() throws ApiException
    {
        String name = "XslfoExample.xslfo";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;
        String resultName = "fromXlsFo.pdf";

        AsposeResponse response = th.pdfApi.putXslFoInStorageToPdf(resultName, srcPath, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetXpsInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getXpsInStorageToPdfTest() throws ApiException
    {
        String name = "Simple.xps";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getXpsInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutXpsInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putXpsInStorageToPdfTest() throws ApiException
    {
        String name = "Simple.xps";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;
        String resultName = "fromXps.pdf";

        AsposeResponse response = th.pdfApi.putXpsInStorageToPdf(resultName, srcPath, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetSvgInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getSvgInStorageToPdfTest() throws ApiException
    {
        String name = "Simple.svg";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getSvgInStorageToPdf(srcPath, null, null, null,
                null, null, null, null, null, null);
        assertNotNull(response);
    }


    /**
     * PutSvgInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putSvgInStorageToPdfTest() throws ApiException
    {
        String name = "Simple.svg";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;
        String resultName = "fromSvg.pdf";

        AsposeResponse response = th.pdfApi.putSvgInStorageToPdf(resultName, srcPath, null,
                null, null, null, null, null,
                null, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPclInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPclInStorageToPdfTest() throws ApiException
    {
        String name = "template.pcl";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getPclInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutPclInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPclInStorageToPdfTest() throws ApiException
    {
        String name = "template.pcl";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;
        String resultName = "fromPcl.pdf";

        AsposeResponse response = th.pdfApi.putPclInStorageToPdf(resultName, srcPath, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetXmlInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getXmlInStorageToPdfTest() throws ApiException
    {
        String name = "template.xml";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getXmlInStorageToPdf(srcPath, null, null);
        assertNotNull(response);
    }


    /**
     * PutXmlInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putXmlInStorageToPdfTest() throws ApiException
    {
        String name = "template.xml";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;
        String resultName = "fromXml.pdf";

        AsposeResponse response = th.pdfApi.putXmlInStorageToPdf(resultName, srcPath, null, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetApsInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getApsInStorageToPdfTest() throws ApiException
    {
        String name = "5pages.aps";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getApsInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutApsInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putApsInStorageToPdfTest() throws ApiException
    {
        String name = "5pages.aps";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;
        String resultName = "fromXml.pdf";

        AsposeResponse response = th.pdfApi.putApsInStorageToPdf(resultName, srcPath, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * GetPsInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getPsInStorageToPdfTest() throws ApiException
    {
        String name = "Typography.PS";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getPsInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutPsInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPsInStorageToPdfTest() throws ApiException
    {
        String name = "Typography.PS";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;
        String resultName = "fromPs.pdf";

        AsposeResponse response = th.pdfApi.putPsInStorageToPdf(resultName, srcPath, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PutImageInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImageInStorageToPdfTest() throws ApiException
    {
        final String dataFile1 = "33539.jpg";
        th.uploadFile(dataFile1);

        final String dataFile2 = "44781.jpg";
        th.uploadFile(dataFile2);

        String resultName = "result.pdf";


        ImageTemplatesRequest imageTemplatesRequest = new ImageTemplatesRequest()
                .isOCR(true)
                .ocRLangs("eng")
                .imagesList(new ArrayList<ImageTemplate>(){{
                    add(new ImageTemplate().imagePath(th.tempFolder + '/' + dataFile1).imageSrcType(ImageSrcType.COMMON));
                    add(new ImageTemplate().imagePath(th.tempFolder + '/' + dataFile2).imageSrcType(ImageSrcType.COMMON));
                }});

        AsposeResponse response = th.pdfApi.putImageInStorageToPdf(resultName, imageTemplatesRequest, th.tempFolder, null);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetMarkdownInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarkdownInStorageToPdfTest() throws ApiException
    {
        String name = "mixed.md";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getMarkdownInStorageToPdf(srcPath, null);
        assertNotNull(response);
    }


    /**
     * PutMarkdownInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putMarkdownInStorageToPdfTest() throws ApiException
    {
        String name = "mixed.md";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;
        String resultName = "fromPs.pdf";

        AsposeResponse response = th.pdfApi.putMarkdownInStorageToPdf(resultName, srcPath, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPdfAInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPdfAInStorageToPdfTest() throws ApiException
    {
        String name = "4pagesPdfA.pdf";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;

        File response = th.pdfApi.getPdfAInStorageToPdf(srcPath, null, null);
        assertNotNull(response);
    }


    /**
     * PutPdfAInStorageToPdf Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putPdfAInStorageToPdfTest() throws ApiException
    {
        String name = "4pagesPdfA.pdf";
        th.uploadFile(name);


        String srcPath = th.tempFolder + '/' + name;
        String resultName = "fromPdfA.pdf";

        AsposeResponse response = th.pdfApi.putPdfAInStorageToPdf(resultName, srcPath, th.tempFolder, null, null);
        assertEquals(200, (int)response.getCode());
    }
}
