![](https://img.shields.io/badge/api-v3.0-lightgrey)  [![GitHub license](https://img.shields.io/github/license/aspose-pdf-cloud/aspose-pdf-cloud-java)](https://github.com/aspose-pdf-cloud/aspose-pdf-cloud-java)

# Java REST API to Process PDF in Cloud
[Aspose.PDF Cloud](https://products.aspose.cloud/pdf) is a true REST API that enables you to perform a wide range of document processing operations including creation, manipulation, conversion and rendering of PDF documents in the cloud.

Our Cloud SDKs are wrappers around REST API in various programming languages, allowing you to process documents in language of your choice quickly and easily, gaining all benefits of strong types and IDE highlights. This repository contains new generation SDKs for Aspose.PDF Cloud and examples.

These SDKs are now fully supported. If you have any questions, see any bugs or have enhancement request, feel free to reach out to us at [Free Support Forums](https://forum.aspose.cloud/c/pdf).

Extract Text & Images of a PDF document online https://products.aspose.app/pdf/parser.

## PDF Processing Features
- Add PDF document's header & footer in text or image format.
- Add tables & stamps (text or image) to PDF documents.
- Append multiple PDF documents to an existing file.
- Work with PDF attachments, annotations, & form fields.
- Apply encryption or decryption to PDF documents & set a password.
- Delete all stamps & tables from a page or entire PDF document.
- Delete a specific stamp or table from the PDF document by its ID.
- Replace single or multiple instances of text on a PDF page or from the entire document.
- Extensive support for converting PDF documents to various other file formats.
- Extract various elements of PDF files & make PDF documents optimized.

## Read & Write PDF Formats
PDF, EPUB, HTML, TeX, SVG, XML, XPS, FDF, XFDF

## Save PDF As
XLS, XLSX, PPTX, DOC, DOCX, MobiXML, JPEG, EMF, PNG, BMP, GIF, TIFF, Text

## Read PDF Formats
MHT, PCL, PS, XSLFO, MD

## Enhancements in Version 26.3
- A new version of Aspose.PDF Cloud was prepared using the latest version of Aspose.PDF for .NET.

## Installation
To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users
Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.aspose</groupId>
    <artifactId>aspose-cloud-pdf</artifactId>
    <version>26.3.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users
Add this dependency to your project's build file:

```groovy
compile "com.aspose:aspose-cloud-pdf:26.3.0"
```

### Others
At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/aspose-cloud-pdf-26.3.0.jar
* target/lib/*.jar

## Getting Started
Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.aspose.asposecloudpdf.*;
import com.aspose.asposecloudpdf.model.*;
import com.aspose.asposecloudpdf.api.PdfApi;

import java.io.File;
import java.util.*;

public class PdfApiExample {

    public static void main(String[] args) {
        // Get App key and App SID from https://cloud.aspose.com
        PdfApi apiInstance = new PdfApi("MY_APP_KEY", "MY_APP_SID");
        String name = "name_example"; // String | The document name.
        String fieldName = "fieldName_example"; // String | The field name/
        String storage = "storage_example"; // String | The document storage.
        String folder = "folder_example"; // String | The document folder.
        try {
            SaaSposeResponse result = apiInstance.deleteField(name, fieldName, storage, folder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PdfApi#deleteField");
            e.printStackTrace();
        }
    }
}
```

## SelfHost Aspose.PDF Cloud
Create **PdfApi** object with one *host* parameter:
```java
        PdfApi apiInstance = new PdfApi("MY_SELFHOST_URL");
```

## Unit Tests
Aspose PDF Cloud SDK includes a suite of unit tests within the "test" subdirectory. These Unit Tests also serves as examples of how to use the Aspose PDF Cloud SDK.

## Licensing
All Aspose.PDF Cloud SDKs are licensed under [MIT License](LICENSE).
