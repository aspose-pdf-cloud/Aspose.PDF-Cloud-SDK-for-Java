# Aspose.PDF Cloud SDK for Java — Agent Analysis

> **Repository:** [aspose-pdf-cloud/aspose-pdf-cloud-java](https://github.com/aspose-pdf-cloud/aspose-pdf-cloud-java)  
> **Version:** 26.6.0 | **Group/Artifact:** `com.aspose:aspose-pdf-cloud`  
> **License:** MIT | **Java Version:** 1.8+  
> **API Version:** v3.0 | **Build:** Maven + Gradle

---

## 1. Repository Overview

The **Aspose.PDF Cloud SDK for Java** is a generated REST API client that wraps the Aspose.PDF Cloud API v3.0. It enables Java applications to perform a wide range of PDF document processing operations — creation, manipulation, conversion, and rendering — entirely in the cloud.

The SDK is auto-generated from the OpenAPI specification and follows a **multi-package, layered structure** under the root package `com.aspose.asposecloudpdf`. The API surface is exposed through a single large `PdfApi` class with **377+ public API methods**, supported by a flat model layer with 200+ model/enum classes.

---

## 2. Architecture & Core Components

### 2.1 Package Structure

```
src/
├── main/
│   └── java/com/aspose/asposecloudpdf/
│       ├── api/
│       │   └── PdfApi.java           # PdfApi — 377+ API methods (~2.2 MB)
│       ├── model/                    # 200+ flat model & enum files
│       │   ├── AsposeResponse.java   # Base response type
│       │   ├── Document.java
│       │   ├── Annotation.java
│       │   ├── AnnotationType.java
│       │   └── ... (one file per model/enum)
│       ├── ApiClient.java            # Core HTTP client, OAuth2 auth, request building
│       ├── ApiCallback.java          # Async callback interface
│       ├── ApiException.java         # Custom exception class
│       ├── ApiResponse.java          # HTTP response wrapper
│       ├── Configuration.java        # Config singleton (default ApiClient)
│       ├── GzipRequestInterceptor.java # Gzip compression interceptor
│       ├── JSON.java                 # Gson-based JSON serialization
│       ├── Pair.java                 # Key-value pair for query params
│       ├── StringUtil.java           # String utilities
│       ├── ProgressRequestBody.java  # Progress tracking for uploads
│       └── ProgressResponseBody.java # Progress tracking for downloads
├── test/
│   └── java/com/aspose/asposecloudpdf/api/
│       ├── TestHelper.java           # Test infrastructure singleton
│       ├── {Feature}Tests.java       # 50 test files
│       └── ...
├── settings/
│   └── credentials.json              # API credentials
├── testData/                         # 50+ test fixture files
├── docs/                             # Markdown API docs (200+ files)
├── Examples/                         # Runnable example project
│   └── src/main/java/com/aspose/asposecloudpdf/examples/
│       ├── Common.java               # Shared helper: uploadFile()
│       ├── annotations/              # 90+ example files
│       ├── convert/                  # ConvertExamples.java
│       ├── document/                 # 100+ example files
│       ├── encrypt/                  # EncryptDecryptExamples.java
│       ├── fields/                   # 6 example files
│       ├── images/                   # 15 example files
│       ├── signs/                    # SignExamples.java
│       ├── tables/                   # 6 example files
│       ├── screen/                   # 2 example files
│       └── bookmarks/                # GetDocumentBookmarsExample.java
├── pom.xml                           # Maven build definition
├── build.gradle                      # Gradle build definition
├── gradlew / gradlew.bat            # Gradle wrapper
└── settings.gradle                   # Gradle settings
```

### 2.2 Core Files

| File | Purpose |
|------|---------|
| **`ApiClient.java`** | HTTP client with OAuth2 client credentials flow, OkHttp-based request building, multipart upload, Gson serialization, SSL config, progress tracking, logging interceptor |
| **`Configuration.java`** | Singleton holder for the default `ApiClient` instance |
| **`JSON.java`** | Gson-based JSON serialization/deserialization with custom type adapters for date/time |
| **`PdfApi.java`** | Main API surface — single class with all REST endpoint methods (377+ methods, ~2.2 MB) |
| **`ApiResponse.java`** | Generic response wrapper with `statusCode` (int), `headers` (Map), and deserialized `data` (T) |
| **`ApiException.java`** | Custom exception carrying HTTP status code, response headers, and response body |
| **`AsposeResponse.java`** | Base response class with `Code` (Integer) and `Status` (String) |

### 2.3 Dependencies

| Dependency | Version | Purpose |
|------------|---------|---------|
| OkHttp | 2.7.5 | HTTP client (last release under the legacy `com.squareup.okhttp` coordinate; upgrading further requires migrating to `com.squareup.okhttp3`) |
| OkHttp Logging Interceptor | 2.7.5 | HTTP request/response logging |
| Gson | 2.11.0 | JSON serialization/deserialization |
| Gson Fire | 1.9.0 | Gson type adapters |
| Swagger Annotations | 1.6.14 | API model annotations |
| ThreeTenBP | 1.6.9 | Backport of Java 8 date/time |
| JUnit | 4.13.2 | Unit testing |

---

## 3. Data Model Organization

### 3.1 Model Files

All models reside in the `com.aspose.asposecloudpdf.model` package. Each PDF concept gets its own file:

| Category | Example Files |
|----------|---------------|
| **Annotations** | `Annotation.java`, `AnnotationType.java`, `AnnotationFlags.java`, `AnnotationState.java`, `AnnotationInfo.java`, `CaretAnnotation.java`, `CircleAnnotation.java`, `FileAttachmentAnnotation.java`, `FreeTextAnnotation.java`, `HighlightAnnotation.java`, `InkAnnotation.java`, `LineAnnotation.java`, `LinkAnnotation.java`, `MovieAnnotation.java`, `PolyAnnotation.java`, `PolyLineAnnotation.java`, `PolygonAnnotation.java`, `PopupAnnotation.java`, `RedactionAnnotation.java`, `ScreenAnnotation.java`, `SoundAnnotation.java`, `SquareAnnotation.java`, `SquigglyAnnotation.java`, `StampAnnotation.java`, `StrikeOutAnnotation.java`, `TextAnnotation.java`, `UnderlineAnnotation.java`, `MarkupAnnotation.java`, `CommonFigureAnnotation.java` |
| **Form Fields** | `Field.java`, `FieldType.java`, `FormField.java`, `CheckBoxField.java`, `ComboBoxField.java`, `ListBoxField.java`, `RadioButtonField.java`, `TextBoxField.java`, `SignatureField.java`, `ChoiceField.java` |
| **Document** | `Document.java`, `DocumentConfig.java`, `DocumentProperty.java`, `DocumentProperties.java`, `DisplayProperties.java`, `DocumentPrivilege.java`, `DocumentLayers.java` |
| **Pages** | `Page.java`, `Pages.java`, `PageLayout.java`, `PageMode.java`, `PageRange.java`, `PageWordCount.java`, `PageNumberStamp.java` |
| **Stamps** | `Stamp.java`, `ImageStamp.java`, `TextStamp.java`, `PageNumberStamp.java`, `PdfPageStamp.java`, `ImageStampPageSpecified.java` |
| **Conversions** | `DocFormat.java`, `HtmlDocumentType.java`, `EpubRecognitionMode.java`, `ColorDepth.java`, `CompressionType.java`, `PdfAType.java`, `OutputFormat.java` |
| **Storage** | `FileVersion.java`, `FileVersions.java`, `FilesList.java`, `FilesUploadResult.java`, `DiscUsage.java`, `ObjectExist.java`, `File.java` |
| **Primitives** | `Color.java`, `Point.java`, `Rectangle.java`, `Dash.java`, `Border.java`, `BorderInfo.java`, `MarginInfo.java`, `GraphInfo.java`, `Link.java`, `LinkElement.java` |
| **Enums** | `AnnotationType.java`, `BorderStyle.java`, `BorderEffect.java`, `CapStyle.java`, `Direction.java`, `FontStyles.java`, `HorizontalAlignment.java`, `Justification.java`, `LineEnding.java`, `LineSpacing.java`, `CryptoAlgorithm.java`, `PermissionsFlags.java` |
| **Headers/Footers** | `ImageFooter.java`, `ImageHeader.java`, `TextHeader.java`, `TextFooter.java` |

### 3.2 Response Type Naming Convention

- **Single entity:** `{Entity}Response` — e.g., `DocumentResponse`, `BookmarkResponse`, `CircleAnnotationResponse`
- **Collection (document-level):** `getDocument{Entities}` — e.g., `getDocumentBookmarks()` returns `BookmarksResponse`
- **Collection (page-level):** `getPage{Entities}` — e.g., `getPageAnnotations()` returns `AnnotationsInfoResponse`
- **Base:** `AsposeResponse` with `Code` (Integer) and `Status` (String)
- **Base + HTTP:** `ApiResponse<T>` generic wrapper with status code, headers, and data

### 3.3 Model Java Conventions

| Convention | Description |
|------------|-------------|
| **POJO style** | Private fields with getters/setters, fluent setters returning `this` |
| **Annotations** | `@SerializedName` for JSON mapping, `@ApiModelProperty` for Swagger docs |
| **`equals`/`hashCode`/`toString`** | Standard Java object methods implemented via `Objects` |
| **Enums** | Custom `@JsonAdapter` with TypeAdapter inner class |
| **MIT license header** | Every source file starts with the same license block |

---

## 4. API Capabilities

The `PdfApi` class exposes **377+ public API methods** organized into the following categories:

### 4.1 Document Operations

| Method | Endpoint / Description |
|--------|----------------------|
| `getDocument(name, ...)` | GET `/pdf/{name}` — Read document info |
| `putCreateDocument(name, ...)` | PUT `/pdf/{name}` — Create empty document |
| `postCreateDocument(name, config, ...)` | POST `/pdf/{name}` — Create document with config |
| `postOptimizeDocument(name, options, ...)` | POST `/pdf/{name}/optimize` — Optimize document |
| `postSplitDocument(name, ...)` | POST `/pdf/{name}/split` — Split document |
| `postSplitRangePdfDocument(name, options, ...)` | POST `/pdf/{name}/split/range` — Split by ranges |
| `postOrganizeDocument(name, ...)` | POST `/pdf/{name}/organize` — Reorder pages |
| `postOrganizeDocuments(request, ...)` | POST `/pdf/organize` — Multi-document organize |
| `putMergeDocuments(name, mergeDocs, ...)` | PUT `/pdf/{name}/merge` — Merge multiple documents |

### 4.2 Page Operations

| Method | Description |
|--------|-------------|
| `getPage(name, pageNumber, ...)` | Get page info |
| `putAddNewPage(name, ...)` | Add new page |
| `deletePage(name, pageNumber, ...)` | Delete page by number |
| `postMovePage(name, ...)` | Move page to new position |
| `postDocumentPagesRotate(name, rotation, ...)` | Rotate pages by angle |
| `postDocumentPagesResize(name, width, height, ...)` | Resize pages |
| `postDocumentPagesCrop(name, rect, ...)` | Crop pages |
| `getPageConvertToTiff/Jpeg/Png/Emf/Bmp/Gif(...)` | Convert page to image (GET) |
| `putPageConvertToTiff/Jpeg/Png/Emf/Bmp/Gif(...)` | Convert page to image (PUT) |
| `putPageAddStamp(name, pageNumber, stamp, ...)` | Add stamp to page |

### 4.3 Annotations (25+ Types)

Each annotation type supports full CRUD operations:

| Operation | Pattern |
|-----------|---------|
| **Get all (document)** | `getDocument{Type}Annotations(name, ...)` |
| **Get all (page)** | `getPage{Type}Annotations(name, pageNumber, ...)` |
| **Get by ID** | `get{Type}Annotation(name, annotationId, ...)` |
| **Create** | `postPage{Type}Annotations(name, pageNumber, annotation, ...)` |
| **Update** | `put{Type}Annotation(name, annotationId, annotation, ...)` |
| **Delete** | `deleteAnnotation(name, annotationId, ...)` |
| **Delete by page** | `deletePageAnnotations(name, pageNumber, ...)` |
| **Delete all** | `deleteDocumentAnnotations(name, ...)` |
| **Flatten** | `putAnnotationsFlatten(name, startPage, endPage, types, ...)` |

Supported annotation types: Text, Circle, Polygon, PolyLine, Line, Square, FreeText, Highlight, Underline, Squiggly, StrikeOut, Caret, Ink, Link, Popup, FileAttachment, Sound, Movie, Screen, Widget, Watermark, Redaction, Stamp, RichMedia, PDF3D.

### 4.4 Form Fields (8 Types)

| Field Type | Operations |
|------------|------------|
| CheckBox, ComboBox, ListBox, RadioButton, TextBox, Signature | Get document fields, get page fields, get by name, create, update, delete |
| General | `getFields`, `getField`, `putUpdateField`, `putUpdateFields`, `putFieldsFlatten`, `postFlattenDocument` |
| Import/Export | XML, FDF, XFDF formats (GET and PUT for each) |

### 4.5 Bookmarks

| Method | Description |
|--------|-------------|
| `getDocumentBookmarks` | Get bookmark tree |
| `getBookmarks` | Get bookmarks at path |
| `getBookmark` | Get single bookmark |
| `postBookmark` | Add bookmark |
| `putBookmark` | Update bookmark |
| `deleteBookmark` | Delete bookmark |
| `deleteDocumentBookmarks` | Delete all bookmarks |

### 4.6 Conversions

**PDF → Other formats:**
`getPdfInStorageTo{Format}` / `putPdfInStorageTo{Format}` / `putPdfInRequestTo{Format}`

Supported target formats: Doc, DocX, Epub, Html, LaTeX, MobiXml, PdfA, Pptx, Svg, TeX, Tiff, Xls, Xlsx, Xml, Xps, Aps.

**Other formats → PDF:**
`get{Format}InStorageToPdf` / `put{Format}InStorageToPdf`

Supported source formats: Aps, Epub, Html, Image, Markdown, Mht, Pcl, Ps, Svg, TeX, Web, Xml, Xps, XslFo.

**Special conversions:**
- `getXfaPdfInStorageToAcroForm` / `putXfaPdfInStorageToAcroForm` / `putXfaPdfInRequestToAcroForm` — XFA to AcroForm

### 4.7 Storage & File Management

| Method | Description |
|--------|-------------|
| `uploadFile` | Upload file to cloud storage |
| `downloadFile` | Download file from cloud storage |
| `copyFile` / `moveFile` / `deleteFile` | File operations |
| `createFolder` / `copyFolder` / `moveFolder` / `deleteFolder` | Folder operations |
| `getFilesList` | List files in folder |
| `getDiscUsage` | Get storage usage |
| `objectExists` / `storageExists` | Check existence |
| `getFileVersions` | List file versions |

### 4.8 Other Features

| Feature | Key Methods |
|---------|-------------|
| **Text** | `getText`, `getPageText`, `putAddText` |
| **Images** | `getImages`, `getImage`, `deleteImage`, `postInsertImage`, `putReplaceImage`, `putReplaceMultipleImage`, `getImageExtractAs{Gif/Jpeg/Png/Tiff}`, `putImageExtractAs{Gif/Jpeg/Png/Tiff}` |
| **Links** | `getPageLinkAnnotations`, `getPageLinkAnnotation`, `postPageLinkAnnotations`, `putLinkAnnotation`, `deleteLinkAnnotation` |
| **Stamps** | `getDocumentStamps`, `putPageAddStamp`, `deleteStamp`, `deleteDocumentStamps`, `deletePageStamps` |
| **Tables** | `getDocumentTables`, `getPageTables`, `getTable`, `postPageTables`, `putTable`, `deleteTable`, `deleteDocumentTables`, `deletePageTables` |
| **Watermarks** | Via image/text stamps |
| **Headers/Footers** | Via `ImageHeader`, `ImageFooter`, `TextHeader`, `TextFooter` |
| **Encryption** | `putEncryptDocument`, `putDecryptDocument`, `putChangePasswordDocument` |
| **Properties** | `getDocumentProperties`, `getDocumentProperty`, `putSetProperty`, `deleteProperty`, `deleteProperties` |
| **XMP Metadata** | `getXmpMetadataJson`, `getXmpMetadataXml`, `postXmpMetadata` |
| **Layers** | `getDocumentLayers`, `deleteDocumentLayer`, `putCreatePdfFromLayer` |
| **Compare** | `postCompareDocument` |
| **Privileges** | `putPrivileges` |
| **OCR** | `putSearchableDocument`, `putSearchableDocumentWithDefaultLanguage` |
| **Signatures** | `getDocumentSignatureFields`, `putSignatureField`, `postSignatureField` |

---

## 5. Testing Infrastructure

### 5.1 Test Base (`TestHelper.java`)

- **Singleton pattern** via `getInstance()` / private constructor
- Reads credentials from `settings/credentials.json` using Gson
- Supports both **public cloud** and **self-hosted** modes (based on `SelfHost` flag)
- Provides `uploadFile(name)` helper that uploads to `TempPdfCloud/` folder
- All tests access `TestHelper.getInstance().pdfApi` for the shared `PdfApi` instance

### 5.2 Credentials Format

```json
{
    "api_url": "https://api.aspose.cloud/v3.0",
    "client_id": "YOUR_CLIENT_ID",
    "client_secret": "YOUR_CLIENT_SECRET",
    "self_host": false
}
```

### 5.3 Test Files (50 files)

| Test File | Focus |
|-----------|-------|
| `DocumentTests.java` | CRUD, optimize, split, organize, rotate, resize, crop |
| `PagesTests.java` | Page operations |
| `AnnotattionsTests.java` | General annotations |
| `CaretAnnotationsTests.java` | Caret annotation CRUD |
| `CircleAnnotationsTests.java` | Circle annotation CRUD |
| `FreeTextAnnotationsTests.java` | Free text annotation CRUD |
| `HighlightAnnotationsTests.java` | Highlight annotation CRUD |
| `InkAnnotationsTests.java` | Ink annotation CRUD |
| `LineAnnotationsTests.java` | Line annotation CRUD |
| `StampAnnotationsTests.java` | Stamp annotation CRUD |
| `TextAnnotationsTests.java` | Text annotation CRUD |
| `SquareAnnotationsTests.java` | Square annotation CRUD |
| `SquigglyAnnotationsTests.java` | Squiggly annotation CRUD |
| `StrikeOutAnnotationsTests.java` | StrikeOut annotation CRUD |
| `UnderlineAnnotationsTests.java` | Underline annotation CRUD |
| `PolygonAnnotationsTests.java` | Polygon annotation CRUD |
| `PolyLineAnnotationsTests.java` | PolyLine annotation CRUD |
| `PopupAnnotationsTests.java` | Popup annotation CRUD |
| `RedactionAnnotationsTests.java` | Redaction annotation CRUD |
| `ScreenAnnotationsTests.java` | Screen annotation CRUD |
| `SoundAnnotationsTests.java` | Sound annotation CRUD |
| `MovieAnnotationsTests.java` | Movie annotation CRUD |
| `FileAttachmentAnnotationsTests.java` | FileAttachment annotation CRUD |
| `LinkAnnotationsTests.java` | Link annotation |
| `FieldsTests.java` | Form field CRUD |
| `ConvertTests.java` | PDF conversion to other formats |
| `ConvertToPdfTests.java` | Other formats to PDF |
| `BookmarksTests.java` | Bookmark CRUD |
| `ImagesTests.java` | Image extraction/manipulation |
| `EncryptDecryptTests.java` | Encryption/decryption |
| `HeaderFooterTests.java` | Headers and footers |
| `StampTests.java` | Stamps |
| `AppendTests.java` | Document append |
| `MergeTests.java` | Document merge |
| `OrganizeTests.java` | Document organize |
| `LinksTests.java` | Link annotations |
| `TextTests.java` | Text operations |
| `TextReplaceTests.java` | Text replacement |
| `PropertiesTests.java` | Document properties |
| `XmpMetadataTests.java` | XMP metadata |
| `LayersTests.java` | Document layers |
| `PrivilegesTests.java` | Document privileges |
| `SignTests.java` | Digital signatures |
| `TableTests.java` | Table operations |
| `StorageTests.java` | File storage operations |
| `ImportExportTests.java` | Form field import/export |
| `OcrTests.java` | OCR/searchable PDF |
| `PageConvertToImageTests.java` | Page-to-image conversion |
| `AttachmentsTestsTests.java` | File attachments |

### 5.4 Test Pattern

All tests follow a consistent pattern:

```java
public class DocumentTests {
    private TestHelper th;

    public DocumentTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    @Test
    public void getDocumentTest() throws ApiException {
        String name = "4pages.pdf";
        this.th.uploadFile(name);
        String folder = this.th.tempFolder;
        DocumentResponse response = this.th.pdfApi.getDocument(name, null, folder, null);
        assertEquals(200, (int)response.getCode());
    }
}
```

### 5.5 Test Data

The `testData/` directory contains **50+ fixture files**:
- PDF documents: `4pages.pdf`, `5pages.pdf`, `PdfWithAnnotations.pdf`, `PdfWithBookmarks.pdf`, `PdfWithAcroForm.pdf`, `PdfWithTable.pdf`, `PdfWithImages.pdf`, `PdfWithLayers.pdf`, etc.
- Images: `Koala.jpg`, `Penguins.jpg`, `butterfly.jpg`, `33539.jpg`, `44781.jpg`
- Other: `sample.tex`, `Simple.svg`, `Simple.xps`, `template.xml`, `template.pcl`, `HtmlExample1.html`, `MhtExample.mht`, `mixed.md`

---

## 6. Examples (`Examples/`)

The `Examples/` directory is a **separate Maven sub-project** containing runnable Java examples.

### 6.1 Example Structure

```
Examples/
├── pom.xml                          # Maven build for examples
├── src/main/java/com/aspose/asposecloudpdf/examples/
│   ├── Common.java                  # Shared helper: uploadFile(pdfApi, name)
│   ├── annotations/                 # 90+ example files (all annotation types)
│   ├── convert/                     # ConvertExamples.java (all conversion types)
│   ├── document/                    # 100+ example files (all document operations)
│   ├── encrypt/                     # EncryptDecryptExamples.java
│   ├── fields/                      # 6 example files
│   ├── images/                      # 15 example files
│   ├── signs/                       # SignExamples.java
│   ├── tables/                      # 6 example files
│   ├── screen/                      # 2 example files
│   └── bookmarks/                   # GetDocumentBookmarsExample.java
└── testData/                        # Test fixture files
```

### 6.2 Common.java Helper

```java
public class Common {
    public static void uploadFile(PdfApi pdfApi, String name) throws ApiException {
        File file = new File("testData" + "/" + name);
        pdfApi.uploadFile(name, file, null);
    }
}
```

### 6.3 Example Pattern

Each example follows a consistent pattern:

```java
public class GetAnnotationsExample {
    public static void main(String[] args) throws ApiException {
        int pageNumber = 2;
        String name = "PdfWithAnnotations.pdf";
        PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

        Common.uploadFile(pdfApi, name);
        AnnotationsInfoResponse response = pdfApi.getPageAnnotations(name, pageNumber, null, "");
        System.out.println(response.getCode());
    }
}
```

### 6.4 Example Categories

| Category | Description | File Count |
|----------|-------------|------------|
| **annotations/** | CRUD for all annotation types (Text, Circle, Square, Highlight, Underline, StrikeOut, Squiggly, Caret, Ink, Line, Polygon, PolyLine, FreeText, Popup, Stamp) | ~90 |
| **convert/** | PDF to/from all supported formats (Doc, DocX, Epub, Html, LaTeX, MobiXml, PdfA, Pptx, Svg, Tiff, Xls, Xlsx, Xml, Xps) | 1 file with many methods |
| **document/** | Document operations (create, read, merge, split, organize, page operations, conversions, stamps, attachments, annotations, layers) | ~100 |
| **encrypt/** | Encrypt, decrypt, change password | 1 file with multiple methods |
| **fields/** | Create, update, delete, flatten form fields | 6 |
| **images/** | Extract, replace, delete images | 15 |
| **signs/** | Digital signatures | 1 |
| **tables/** | CRUD for tables | 6 |
| **screen/** | Screen annotation data extraction | 2 |
| **bookmarks/** | Get document bookmarks | 1 |

---

## 7. Design Patterns & Conventions

### 7.1 Code Generation

The SDK is **auto-generated** from the OpenAPI specification. Evidence:
- `.swagger-codegen-ignore` file present
- Consistent, repetitive method structure across all 377+ API methods
- Flat file-per-model organization in the `model/` package
- Uniform error handling and parameter validation

### 7.2 Key Conventions

| Convention | Description |
|------------|-------------|
| **Package structure** | `com.aspose.asposecloudpdf.api` (API), `com.aspose.asposecloudpdf.model` (models), `com.aspose.asposecloudpdf` (core) |
| **Flat model layout** | One file per model/enum in `model/` package |
| **MIT license header** | Every source file starts with the same license block |
| **Return pattern** | `{Model}` for GET/entity methods, `AsposeResponse` for state-changing methods, `void` for storage delete methods |
| **Exception handling** | All API methods declare `throws ApiException` |
| **Optional params** | Passed as individual method parameters (nullable) |
| **Self-host support** | `SelfHost` flag in credentials, separate `PdfApi(String host)` constructor |
| **Dual build system** | Maven (`pom.xml`) and Gradle (`build.gradle`) both supported |

### 7.3 Error Handling

```java
// ApiException carries HTTP status code, headers, and response body
public class ApiException extends Exception {
    private int code = 0;
    private Map<String, List<String>> responseHeaders = null;
    private String responseBody = null;
}
```

### 7.4 PdfApi Constructor Patterns

```java
// Cloud mode with client credentials
PdfApi apiInstance = new PdfApi("CLIENT_SECRET", "CLIENT_ID");

// Self-hosted mode
PdfApi apiInstance = new PdfApi("MY_SELFHOST_URL");
```

---

## 8. Build & Installation

### 8.1 Maven

Add to your `pom.xml`:

```xml
<dependency>
    <groupId>com.aspose</groupId>
    <artifactId>aspose-cloud-pdf</artifactId>
    <version>26.6.0</version>
    <scope>compile</scope>
</dependency>
```

Build locally:

```bash
mvn install
```

### 8.2 Gradle

Add to your `build.gradle`:

```groovy
compile "com.aspose:aspose-cloud-pdf:26.6.0"
```

Build locally:

```bash
./gradlew build
```

### 8.3 Manual Build

```bash
mvn package
# JARs generated at:
#   target/aspose-cloud-pdf-26.6.0.jar
#   target/lib/*.jar
```

---

## 9. Documentation

The `docs/` directory contains **Markdown files** with API documentation:

- `PdfApi.md` — Full API method reference
- `{Model}.md` — One file per model type (e.g., `Document.md`, `Annotation.md`, `Bookmark.md`)
- `{Response}.md` — One file per response type (e.g., `DocumentResponse.md`, `AnnotationsResponse.md`)
- Storage docs: `File.md`, `FileVersion.md`, `FilesList.md`, `FilesUploadResult.md`, `DiscUsage.md`, `ObjectExist.md`
