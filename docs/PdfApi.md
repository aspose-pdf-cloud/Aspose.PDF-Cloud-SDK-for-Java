# PdfApi

All URIs are relative to *https://api.aspose.cloud/v3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyFile**](PdfApi.md#copyFile) | **PUT** /pdf/storage/file/copy/\{srcPath} | Copy file
[**copyFolder**](PdfApi.md#copyFolder) | **PUT** /pdf/storage/folder/copy/\{srcPath} | Copy folder
[**createFolder**](PdfApi.md#createFolder) | **PUT** /pdf/storage/folder/\{path} | Create the folder
[**deleteAnnotation**](PdfApi.md#deleteAnnotation) | **DELETE** /pdf/\{name}/annotations/\{annotationId} | Delete document annotation by ID
[**deleteBookmark**](PdfApi.md#deleteBookmark) | **DELETE** /pdf/\{name}/bookmarks/bookmark/\{bookmarkPath} | Delete document bookmark by ID.
[**deleteDocumentAnnotations**](PdfApi.md#deleteDocumentAnnotations) | **DELETE** /pdf/\{name}/annotations | Delete all annotations from the document
[**deleteDocumentBookmarks**](PdfApi.md#deleteDocumentBookmarks) | **DELETE** /pdf/\{name}/bookmarks/tree | Delete all document bookmarks.
[**deleteDocumentLayer**](PdfApi.md#deleteDocumentLayer) | **DELETE** /pdf/\{name}/layers | Remove document layer.
[**deleteDocumentLinkAnnotations**](PdfApi.md#deleteDocumentLinkAnnotations) | **DELETE** /pdf/\{name}/links | Delete all link annotations from the document
[**deleteDocumentStamps**](PdfApi.md#deleteDocumentStamps) | **DELETE** /pdf/\{name}/stamps | Delete all stamps from the document
[**deleteDocumentTables**](PdfApi.md#deleteDocumentTables) | **DELETE** /pdf/\{name}/tables | Delete all tables from the document
[**deleteField**](PdfApi.md#deleteField) | **DELETE** /pdf/\{name}/fields/\{fieldName} | Delete document field by name.
[**deleteFile**](PdfApi.md#deleteFile) | **DELETE** /pdf/storage/file/\{path} | Delete file
[**deleteFolder**](PdfApi.md#deleteFolder) | **DELETE** /pdf/storage/folder/\{path} | Delete folder
[**deleteImage**](PdfApi.md#deleteImage) | **DELETE** /pdf/\{name}/images/\{imageId} | Delete image from document page.
[**deleteLinkAnnotation**](PdfApi.md#deleteLinkAnnotation) | **DELETE** /pdf/\{name}/links/\{linkId} | Delete document page link annotation by ID
[**deletePage**](PdfApi.md#deletePage) | **DELETE** /pdf/\{name}/pages/\{pageNumber} | Delete document page by its number.
[**deletePageAnnotations**](PdfApi.md#deletePageAnnotations) | **DELETE** /pdf/\{name}/pages/\{pageNumber}/annotations | Delete all annotations from the page
[**deletePageLinkAnnotations**](PdfApi.md#deletePageLinkAnnotations) | **DELETE** /pdf/\{name}/pages/\{pageNumber}/links | Delete all link annotations from the page
[**deletePageStamps**](PdfApi.md#deletePageStamps) | **DELETE** /pdf/\{name}/pages/\{pageNumber}/stamps | Delete all stamps from the page
[**deletePageTables**](PdfApi.md#deletePageTables) | **DELETE** /pdf/\{name}/pages/\{pageNumber}/tables | Delete all tables from the page
[**deleteProperties**](PdfApi.md#deleteProperties) | **DELETE** /pdf/\{name}/documentproperties | Delete custom document properties.
[**deleteProperty**](PdfApi.md#deleteProperty) | **DELETE** /pdf/\{name}/documentproperties/\{propertyName} | Delete document property.
[**deleteStamp**](PdfApi.md#deleteStamp) | **DELETE** /pdf/\{name}/stamps/\{stampId} | Delete document stamp by ID
[**deleteTable**](PdfApi.md#deleteTable) | **DELETE** /pdf/\{name}/tables/\{tableId} | Delete document table by ID
[**downloadFile**](PdfApi.md#downloadFile) | **GET** /pdf/storage/file/\{path} | Download file
[**getApsInStorageToPdf**](PdfApi.md#getApsInStorageToPdf) | **GET** /pdf/create/aps | Convert APS file (located on storage) to PDF format and return resulting file in response. 
[**getBookmark**](PdfApi.md#getBookmark) | **GET** /pdf/\{name}/bookmarks/bookmark/\{bookmarkPath} | Read document bookmark.
[**getBookmarks**](PdfApi.md#getBookmarks) | **GET** /pdf/\{name}/bookmarks/list/\{bookmarkPath} | Read document bookmarks node list.
[**getCaretAnnotation**](PdfApi.md#getCaretAnnotation) | **GET** /pdf/\{name}/annotations/caret/\{annotationId} | Read document page caret annotation by ID.
[**getCheckBoxField**](PdfApi.md#getCheckBoxField) | **GET** /pdf/\{name}/fields/checkbox/\{fieldName} | Read document checkbox field by name.
[**getCircleAnnotation**](PdfApi.md#getCircleAnnotation) | **GET** /pdf/\{name}/annotations/circle/\{annotationId} | Read document page circle annotation by ID.
[**getComboBoxField**](PdfApi.md#getComboBoxField) | **GET** /pdf/\{name}/fields/combobox/\{fieldName} | Read document combobox field by name.
[**getDiscUsage**](PdfApi.md#getDiscUsage) | **GET** /pdf/storage/disc | Get disc usage
[**getDocument**](PdfApi.md#getDocument) | **GET** /pdf/\{name} | Read common document info.
[**getDocumentAnnotations**](PdfApi.md#getDocumentAnnotations) | **GET** /pdf/\{name}/annotations | Read document page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.
[**getDocumentAttachmentByIndex**](PdfApi.md#getDocumentAttachmentByIndex) | **GET** /pdf/\{name}/attachments/\{attachmentIndex} | Read document attachment info by its index.
[**getDocumentAttachments**](PdfApi.md#getDocumentAttachments) | **GET** /pdf/\{name}/attachments | Read document attachments info.
[**getDocumentBookmarks**](PdfApi.md#getDocumentBookmarks) | **GET** /pdf/\{name}/bookmarks/tree | Read document bookmarks tree.
[**getDocumentCaretAnnotations**](PdfApi.md#getDocumentCaretAnnotations) | **GET** /pdf/\{name}/annotations/caret | Read document caret annotations.
[**getDocumentCheckBoxFields**](PdfApi.md#getDocumentCheckBoxFields) | **GET** /pdf/\{name}/fields/checkbox | Read document checkbox fields.
[**getDocumentCircleAnnotations**](PdfApi.md#getDocumentCircleAnnotations) | **GET** /pdf/\{name}/annotations/circle | Read document circle annotations.
[**getDocumentComboBoxFields**](PdfApi.md#getDocumentComboBoxFields) | **GET** /pdf/\{name}/fields/combobox | Read document combobox fields.
[**getDocumentDisplayProperties**](PdfApi.md#getDocumentDisplayProperties) | **GET** /pdf/\{name}/displayproperties | Read document display properties.
[**getDocumentFileAttachmentAnnotations**](PdfApi.md#getDocumentFileAttachmentAnnotations) | **GET** /pdf/\{name}/annotations/fileattachment | Read document FileAttachment annotations.
[**getDocumentFreeTextAnnotations**](PdfApi.md#getDocumentFreeTextAnnotations) | **GET** /pdf/\{name}/annotations/freetext | Read document free text annotations.
[**getDocumentHighlightAnnotations**](PdfApi.md#getDocumentHighlightAnnotations) | **GET** /pdf/\{name}/annotations/highlight | Read document highlight annotations.
[**getDocumentInkAnnotations**](PdfApi.md#getDocumentInkAnnotations) | **GET** /pdf/\{name}/annotations/ink | Read document ink annotations.
[**getDocumentLayers**](PdfApi.md#getDocumentLayers) | **GET** /pdf/\{name}/layers | Gets document layers.
[**getDocumentLineAnnotations**](PdfApi.md#getDocumentLineAnnotations) | **GET** /pdf/\{name}/annotations/line | Read document line annotations.
[**getDocumentListBoxFields**](PdfApi.md#getDocumentListBoxFields) | **GET** /pdf/\{name}/fields/listbox | Read document listbox fields.
[**getDocumentMovieAnnotations**](PdfApi.md#getDocumentMovieAnnotations) | **GET** /pdf/\{name}/annotations/movie | Read document movie annotations.
[**getDocumentPolyLineAnnotations**](PdfApi.md#getDocumentPolyLineAnnotations) | **GET** /pdf/\{name}/annotations/polyline | Read document polyline annotations.
[**getDocumentPolygonAnnotations**](PdfApi.md#getDocumentPolygonAnnotations) | **GET** /pdf/\{name}/annotations/polygon | Read document polygon annotations.
[**getDocumentPopupAnnotations**](PdfApi.md#getDocumentPopupAnnotations) | **GET** /pdf/\{name}/annotations/popup | Read document popup annotations.
[**getDocumentPopupAnnotationsByParent**](PdfApi.md#getDocumentPopupAnnotationsByParent) | **GET** /pdf/\{name}/annotations/\{annotationId}/popup | Read document popup annotations by parent id.
[**getDocumentProperties**](PdfApi.md#getDocumentProperties) | **GET** /pdf/\{name}/documentproperties | Read document properties.
[**getDocumentProperty**](PdfApi.md#getDocumentProperty) | **GET** /pdf/\{name}/documentproperties/\{propertyName} | Read document property by name.
[**getDocumentRadioButtonFields**](PdfApi.md#getDocumentRadioButtonFields) | **GET** /pdf/\{name}/fields/radiobutton | Read document radiobutton fields.
[**getDocumentRedactionAnnotations**](PdfApi.md#getDocumentRedactionAnnotations) | **GET** /pdf/\{name}/annotations/redaction | Read document redaction annotations.
[**getDocumentScreenAnnotations**](PdfApi.md#getDocumentScreenAnnotations) | **GET** /pdf/\{name}/annotations/screen | Read document screen annotations.
[**getDocumentSignatureFields**](PdfApi.md#getDocumentSignatureFields) | **GET** /pdf/\{name}/fields/signature | Read document signature fields.
[**getDocumentSoundAnnotations**](PdfApi.md#getDocumentSoundAnnotations) | **GET** /pdf/\{name}/annotations/sound | Read document sound annotations.
[**getDocumentSquareAnnotations**](PdfApi.md#getDocumentSquareAnnotations) | **GET** /pdf/\{name}/annotations/square | Read document square annotations.
[**getDocumentSquigglyAnnotations**](PdfApi.md#getDocumentSquigglyAnnotations) | **GET** /pdf/\{name}/annotations/squiggly | Read document squiggly annotations.
[**getDocumentStampAnnotations**](PdfApi.md#getDocumentStampAnnotations) | **GET** /pdf/\{name}/annotations/stamp | Read document stamp annotations.
[**getDocumentStamps**](PdfApi.md#getDocumentStamps) | **GET** /pdf/\{name}/stamps | Read document stamps.
[**getDocumentStrikeOutAnnotations**](PdfApi.md#getDocumentStrikeOutAnnotations) | **GET** /pdf/\{name}/annotations/strikeout | Read document StrikeOut annotations.
[**getDocumentTables**](PdfApi.md#getDocumentTables) | **GET** /pdf/\{name}/tables | Read document tables.
[**getDocumentTextAnnotations**](PdfApi.md#getDocumentTextAnnotations) | **GET** /pdf/\{name}/annotations/text | Read document text annotations.
[**getDocumentTextBoxFields**](PdfApi.md#getDocumentTextBoxFields) | **GET** /pdf/\{name}/fields/textbox | Read document text box fields.
[**getDocumentUnderlineAnnotations**](PdfApi.md#getDocumentUnderlineAnnotations) | **GET** /pdf/\{name}/annotations/underline | Read document underline annotations.
[**getDownloadDocumentAttachmentByIndex**](PdfApi.md#getDownloadDocumentAttachmentByIndex) | **GET** /pdf/\{name}/attachments/\{attachmentIndex}/download | Download document attachment content by its index.
[**getEpubInStorageToPdf**](PdfApi.md#getEpubInStorageToPdf) | **GET** /pdf/create/epub | Convert EPUB file (located on storage) to PDF format and return resulting file in response. 
[**getExportFieldsFromPdfToFdfInStorage**](PdfApi.md#getExportFieldsFromPdfToFdfInStorage) | **GET** /pdf/\{name}/export/fdf | Export fields from from PDF in storage to FDF file.
[**getExportFieldsFromPdfToXfdfInStorage**](PdfApi.md#getExportFieldsFromPdfToXfdfInStorage) | **GET** /pdf/\{name}/export/xfdf | Export fields from from PDF in storage to XFDF file.
[**getExportFieldsFromPdfToXmlInStorage**](PdfApi.md#getExportFieldsFromPdfToXmlInStorage) | **GET** /pdf/\{name}/export/xml | Export fields from from PDF in storage to XML file.
[**getField**](PdfApi.md#getField) | **GET** /pdf/\{name}/fields/\{fieldName} | Get document field by name.
[**getFields**](PdfApi.md#getFields) | **GET** /pdf/\{name}/fields | Get document fields.
[**getFileAttachmentAnnotation**](PdfApi.md#getFileAttachmentAnnotation) | **GET** /pdf/\{name}/annotations/fileattachment/\{annotationId} | Read document page FileAttachment annotation by ID.
[**getFileAttachmentAnnotationData**](PdfApi.md#getFileAttachmentAnnotationData) | **GET** /pdf/\{name}/annotations/fileattachment/\{annotationId}/data | Read document page FileAttachment annotation by ID.
[**getFileVersions**](PdfApi.md#getFileVersions) | **GET** /pdf/storage/version/\{path} | Get file versions
[**getFilesList**](PdfApi.md#getFilesList) | **GET** /pdf/storage/folder/\{path} | Get all files and folders within a folder
[**getFreeTextAnnotation**](PdfApi.md#getFreeTextAnnotation) | **GET** /pdf/\{name}/annotations/freetext/\{annotationId} | Read document page free text annotation by ID.
[**getHighlightAnnotation**](PdfApi.md#getHighlightAnnotation) | **GET** /pdf/\{name}/annotations/highlight/\{annotationId} | Read document page highlight annotation by ID.
[**getHtmlInStorageToPdf**](PdfApi.md#getHtmlInStorageToPdf) | **GET** /pdf/create/html | Convert HTML file (located on storage) to PDF format and return resulting file in response. 
[**getImage**](PdfApi.md#getImage) | **GET** /pdf/\{name}/images/\{imageId} | Read document image by ID.
[**getImageExtractAsGif**](PdfApi.md#getImageExtractAsGif) | **GET** /pdf/\{name}/images/\{imageId}/extract/gif | Extract document image in GIF format
[**getImageExtractAsJpeg**](PdfApi.md#getImageExtractAsJpeg) | **GET** /pdf/\{name}/images/\{imageId}/extract/jpeg | Extract document image in JPEG format
[**getImageExtractAsPng**](PdfApi.md#getImageExtractAsPng) | **GET** /pdf/\{name}/images/\{imageId}/extract/png | Extract document image in PNG format
[**getImageExtractAsTiff**](PdfApi.md#getImageExtractAsTiff) | **GET** /pdf/\{name}/images/\{imageId}/extract/tiff | Extract document image in TIFF format
[**getImages**](PdfApi.md#getImages) | **GET** /pdf/\{name}/pages/\{pageNumber}/images | Read document images.
[**getImagesExtractSvg**](PdfApi.md#getImagesExtractSvg) | **GET** /pdf/\{name}/pages/\{pageNumber}/images/extract/svg | Extract SVG images from document page.
[**getImportFieldsFromFdfInStorage**](PdfApi.md#getImportFieldsFromFdfInStorage) | **GET** /pdf/\{name}/import/fdf | Update fields from FDF file in storage.
[**getImportFieldsFromXfdfInStorage**](PdfApi.md#getImportFieldsFromXfdfInStorage) | **GET** /pdf/\{name}/import/xfdf | Update fields from XFDF file in storage.
[**getImportFieldsFromXmlInStorage**](PdfApi.md#getImportFieldsFromXmlInStorage) | **GET** /pdf/\{name}/import/xml | Import from XML file (located on storage) to PDF format and return resulting file in response. 
[**getInkAnnotation**](PdfApi.md#getInkAnnotation) | **GET** /pdf/\{name}/annotations/ink/\{annotationId} | Read document page ink annotation by ID.
[**getLineAnnotation**](PdfApi.md#getLineAnnotation) | **GET** /pdf/\{name}/annotations/line/\{annotationId} | Read document page line annotation by ID.
[**getLinkAnnotation**](PdfApi.md#getLinkAnnotation) | **GET** /pdf/\{name}/links/\{linkId} | Read document link annotation by ID.
[**getListBoxField**](PdfApi.md#getListBoxField) | **GET** /pdf/\{name}/fields/listbox/\{fieldName} | Read document listbox field by name.
[**getMarkdownInStorageToPdf**](PdfApi.md#getMarkdownInStorageToPdf) | **GET** /pdf/create/markdown | Convert MD file (located on storage) to PDF format and return resulting file in response. 
[**getMhtInStorageToPdf**](PdfApi.md#getMhtInStorageToPdf) | **GET** /pdf/create/mht | Convert MHT file (located on storage) to PDF format and return resulting file in response. 
[**getMovieAnnotation**](PdfApi.md#getMovieAnnotation) | **GET** /pdf/\{name}/annotations/movie/\{annotationId} | Read document page movie annotation by ID.
[**getPage**](PdfApi.md#getPage) | **GET** /pdf/\{name}/pages/\{pageNumber} | Read document page info.
[**getPageAnnotations**](PdfApi.md#getPageAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations | Read document page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.
[**getPageCaretAnnotations**](PdfApi.md#getPageCaretAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/caret | Read document page caret annotations.
[**getPageCheckBoxFields**](PdfApi.md#getPageCheckBoxFields) | **GET** /pdf/\{name}/page/\{pageNumber}/fields/checkbox | Read document page checkbox fields.
[**getPageCircleAnnotations**](PdfApi.md#getPageCircleAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/circle | Read document page circle annotations.
[**getPageComboBoxFields**](PdfApi.md#getPageComboBoxFields) | **GET** /pdf/\{name}/page/\{pageNumber}/fields/combobox | Read document page combobox fields.
[**getPageConvertToBmp**](PdfApi.md#getPageConvertToBmp) | **GET** /pdf/\{name}/pages/\{pageNumber}/convert/bmp | Convert document page to Bmp image and return resulting file in response.
[**getPageConvertToEmf**](PdfApi.md#getPageConvertToEmf) | **GET** /pdf/\{name}/pages/\{pageNumber}/convert/emf | Convert document page to Emf image and return resulting file in response.
[**getPageConvertToGif**](PdfApi.md#getPageConvertToGif) | **GET** /pdf/\{name}/pages/\{pageNumber}/convert/gif | Convert document page to Gif image and return resulting file in response.
[**getPageConvertToJpeg**](PdfApi.md#getPageConvertToJpeg) | **GET** /pdf/\{name}/pages/\{pageNumber}/convert/jpeg | Convert document page to Jpeg image and return resulting file in response.
[**getPageConvertToPng**](PdfApi.md#getPageConvertToPng) | **GET** /pdf/\{name}/pages/\{pageNumber}/convert/png | Convert document page to Png image and return resulting file in response.
[**getPageConvertToTiff**](PdfApi.md#getPageConvertToTiff) | **GET** /pdf/\{name}/pages/\{pageNumber}/convert/tiff | Convert document page to Tiff image  and return resulting file in response.
[**getPageFileAttachmentAnnotations**](PdfApi.md#getPageFileAttachmentAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/fileattachment | Read document page FileAttachment annotations.
[**getPageFreeTextAnnotations**](PdfApi.md#getPageFreeTextAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/freetext | Read document page free text annotations.
[**getPageHighlightAnnotations**](PdfApi.md#getPageHighlightAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/highlight | Read document page highlight annotations.
[**getPageInkAnnotations**](PdfApi.md#getPageInkAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/ink | Read document page ink annotations.
[**getPageLineAnnotations**](PdfApi.md#getPageLineAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/line | Read document page line annotations.
[**getPageLinkAnnotation**](PdfApi.md#getPageLinkAnnotation) | **GET** /pdf/\{name}/pages/\{pageNumber}/links/\{linkId} | Read document page link annotation by ID.
[**getPageLinkAnnotations**](PdfApi.md#getPageLinkAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/links | Read document page link annotations.
[**getPageListBoxFields**](PdfApi.md#getPageListBoxFields) | **GET** /pdf/\{name}/page/\{pageNumber}/fields/listbox | Read document page listbox fields.
[**getPageMovieAnnotations**](PdfApi.md#getPageMovieAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/movie | Read document page movie annotations.
[**getPagePolyLineAnnotations**](PdfApi.md#getPagePolyLineAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/polyline | Read document page polyline annotations.
[**getPagePolygonAnnotations**](PdfApi.md#getPagePolygonAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/polygon | Read document page polygon annotations.
[**getPagePopupAnnotations**](PdfApi.md#getPagePopupAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/popup | Read document page popup annotations.
[**getPageRadioButtonFields**](PdfApi.md#getPageRadioButtonFields) | **GET** /pdf/\{name}/page/\{pageNumber}/fields/radiobutton | Read document page radiobutton fields.
[**getPageRedactionAnnotations**](PdfApi.md#getPageRedactionAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/redaction | Read document page redaction annotations.
[**getPageScreenAnnotations**](PdfApi.md#getPageScreenAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/screen | Read document page screen annotations.
[**getPageSignatureFields**](PdfApi.md#getPageSignatureFields) | **GET** /pdf/\{name}/page/\{pageNumber}/fields/signature | Read document page signature fields.
[**getPageSoundAnnotations**](PdfApi.md#getPageSoundAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/sound | Read document page sound annotations.
[**getPageSquareAnnotations**](PdfApi.md#getPageSquareAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/square | Read document page square annotations.
[**getPageSquigglyAnnotations**](PdfApi.md#getPageSquigglyAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/squiggly | Read document page squiggly annotations.
[**getPageStampAnnotations**](PdfApi.md#getPageStampAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/stamp | Read document page stamp annotations.
[**getPageStamps**](PdfApi.md#getPageStamps) | **GET** /pdf/\{name}/pages/\{pageNumber}/stamps | Read page document stamps.
[**getPageStrikeOutAnnotations**](PdfApi.md#getPageStrikeOutAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/strikeout | Read document page StrikeOut annotations.
[**getPageTables**](PdfApi.md#getPageTables) | **GET** /pdf/\{name}/pages/\{pageNumber}/tables | Read document page tables.
[**getPageText**](PdfApi.md#getPageText) | **GET** /pdf/\{name}/pages/\{pageNumber}/text | Read page text items.
[**getPageTextAnnotations**](PdfApi.md#getPageTextAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/text | Read document page text annotations.
[**getPageTextBoxFields**](PdfApi.md#getPageTextBoxFields) | **GET** /pdf/\{name}/page/\{pageNumber}/fields/textbox | Read document page text box fields.
[**getPageUnderlineAnnotations**](PdfApi.md#getPageUnderlineAnnotations) | **GET** /pdf/\{name}/pages/\{pageNumber}/annotations/underline | Read document page underline annotations.
[**getPages**](PdfApi.md#getPages) | **GET** /pdf/\{name}/pages | Read document pages info.
[**getPclInStorageToPdf**](PdfApi.md#getPclInStorageToPdf) | **GET** /pdf/create/pcl | Convert PCL file (located on storage) to PDF format and return resulting file in response. 
[**getPdfAInStorageToPdf**](PdfApi.md#getPdfAInStorageToPdf) | **GET** /pdf/create/pdfa | Convert PDFA file (located on storage) to PDF format and return resulting file in response. 
[**getPdfInStorageToAps**](PdfApi.md#getPdfInStorageToAps) | **GET** /pdf/\{name}/convert/aps | Converts PDF document (located on storage) to APS format and returns resulting file in response content
[**getPdfInStorageToDoc**](PdfApi.md#getPdfInStorageToDoc) | **GET** /pdf/\{name}/convert/doc | Converts PDF document (located on storage) to DOC format and returns resulting file in response content.
[**getPdfInStorageToEpub**](PdfApi.md#getPdfInStorageToEpub) | **GET** /pdf/\{name}/convert/epub | Converts PDF document (located on storage) to EPUB format and returns resulting file in response content
[**getPdfInStorageToHtml**](PdfApi.md#getPdfInStorageToHtml) | **GET** /pdf/\{name}/convert/html | Converts PDF document (located on storage) to Html format and returns resulting file in response content
[**getPdfInStorageToMobiXml**](PdfApi.md#getPdfInStorageToMobiXml) | **GET** /pdf/\{name}/convert/mobixml | Converts PDF document (located on storage) to MOBIXML format and returns resulting ZIP archive file in response content.
[**getPdfInStorageToPdfA**](PdfApi.md#getPdfInStorageToPdfA) | **GET** /pdf/\{name}/convert/pdfa | Converts PDF document (located on storage) to PdfA format and returns resulting file in response content
[**getPdfInStorageToPptx**](PdfApi.md#getPdfInStorageToPptx) | **GET** /pdf/\{name}/convert/pptx | Converts PDF document (located on storage) to PPTX format and returns resulting file in response content
[**getPdfInStorageToSvg**](PdfApi.md#getPdfInStorageToSvg) | **GET** /pdf/\{name}/convert/svg | Converts PDF document (located on storage) to SVG format and returns resulting file in response content
[**getPdfInStorageToTeX**](PdfApi.md#getPdfInStorageToTeX) | **GET** /pdf/\{name}/convert/tex | Converts PDF document (located on storage) to TeX format and returns resulting file in response content
[**getPdfInStorageToText**](PdfApi.md#getPdfInStorageToText) | **GET** /pdf/\{name}/convert/text | Converts PDF document (located on storage) to Text format and returns resulting file in response content
[**getPdfInStorageToTiff**](PdfApi.md#getPdfInStorageToTiff) | **GET** /pdf/\{name}/convert/tiff | Converts PDF document (located on storage) to TIFF format and returns resulting file in response content
[**getPdfInStorageToXls**](PdfApi.md#getPdfInStorageToXls) | **GET** /pdf/\{name}/convert/xls | Converts PDF document (located on storage) to XLS format and returns resulting file in response content
[**getPdfInStorageToXlsx**](PdfApi.md#getPdfInStorageToXlsx) | **GET** /pdf/\{name}/convert/xlsx | Converts PDF document (located on storage) to XLSX format and returns resulting file in response content
[**getPdfInStorageToXml**](PdfApi.md#getPdfInStorageToXml) | **GET** /pdf/\{name}/convert/xml | Converts PDF document (located on storage) to XML format and returns resulting file in response content
[**getPdfInStorageToXps**](PdfApi.md#getPdfInStorageToXps) | **GET** /pdf/\{name}/convert/xps | Converts PDF document (located on storage) to XPS format and returns resulting file in response content
[**getPolyLineAnnotation**](PdfApi.md#getPolyLineAnnotation) | **GET** /pdf/\{name}/annotations/polyline/\{annotationId} | Read document page polyline annotation by ID.
[**getPolygonAnnotation**](PdfApi.md#getPolygonAnnotation) | **GET** /pdf/\{name}/annotations/polygon/\{annotationId} | Read document page polygon annotation by ID.
[**getPopupAnnotation**](PdfApi.md#getPopupAnnotation) | **GET** /pdf/\{name}/annotations/popup/\{annotationId} | Read document page popup annotation by ID.
[**getPsInStorageToPdf**](PdfApi.md#getPsInStorageToPdf) | **GET** /pdf/create/ps | Convert PS file (located on storage) to PDF format and return resulting file in response. 
[**getRadioButtonField**](PdfApi.md#getRadioButtonField) | **GET** /pdf/\{name}/fields/radiobutton/\{fieldName} | Read document RadioButton field by name.
[**getRedactionAnnotation**](PdfApi.md#getRedactionAnnotation) | **GET** /pdf/\{name}/annotations/redaction/\{annotationId} | Read document page redaction annotation by ID.
[**getScreenAnnotation**](PdfApi.md#getScreenAnnotation) | **GET** /pdf/\{name}/annotations/screen/\{annotationId} | Read document page screen annotation by ID.
[**getScreenAnnotationData**](PdfApi.md#getScreenAnnotationData) | **GET** /pdf/\{name}/annotations/screen/\{annotationId}/data | Read document page screen annotation by ID.
[**getSignatureField**](PdfApi.md#getSignatureField) | **GET** /pdf/\{name}/fields/signature/\{fieldName} | Read document signature field by name.
[**getSoundAnnotation**](PdfApi.md#getSoundAnnotation) | **GET** /pdf/\{name}/annotations/sound/\{annotationId} | Read document page sound annotation by ID.
[**getSoundAnnotationData**](PdfApi.md#getSoundAnnotationData) | **GET** /pdf/\{name}/annotations/sound/\{annotationId}/data | Read document page sound annotation by ID.
[**getSquareAnnotation**](PdfApi.md#getSquareAnnotation) | **GET** /pdf/\{name}/annotations/square/\{annotationId} | Read document page square annotation by ID.
[**getSquigglyAnnotation**](PdfApi.md#getSquigglyAnnotation) | **GET** /pdf/\{name}/annotations/squiggly/\{annotationId} | Read document page squiggly annotation by ID.
[**getStampAnnotation**](PdfApi.md#getStampAnnotation) | **GET** /pdf/\{name}/annotations/stamp/\{annotationId} | Read document page stamp annotation by ID.
[**getStampAnnotationData**](PdfApi.md#getStampAnnotationData) | **GET** /pdf/\{name}/annotations/stamp/\{annotationId}/data | Read document page stamp annotation by ID.
[**getStrikeOutAnnotation**](PdfApi.md#getStrikeOutAnnotation) | **GET** /pdf/\{name}/annotations/strikeout/\{annotationId} | Read document page StrikeOut annotation by ID.
[**getSvgInStorageToPdf**](PdfApi.md#getSvgInStorageToPdf) | **GET** /pdf/create/svg | Convert SVG file (located on storage) to PDF format and return resulting file in response. 
[**getTable**](PdfApi.md#getTable) | **GET** /pdf/\{name}/tables/\{tableId} | Read document page table by ID.
[**getTeXInStorageToPdf**](PdfApi.md#getTeXInStorageToPdf) | **GET** /pdf/create/tex | Convert TeX file (located on storage) to PDF format and return resulting file in response. 
[**getText**](PdfApi.md#getText) | **GET** /pdf/\{name}/text | Read document text.
[**getTextAnnotation**](PdfApi.md#getTextAnnotation) | **GET** /pdf/\{name}/annotations/text/\{annotationId} | Read document page text annotation by ID.
[**getTextBoxField**](PdfApi.md#getTextBoxField) | **GET** /pdf/\{name}/fields/textbox/\{fieldName} | Read document text box field by name.
[**getUnderlineAnnotation**](PdfApi.md#getUnderlineAnnotation) | **GET** /pdf/\{name}/annotations/underline/\{annotationId} | Read document page underline annotation by ID.
[**getVerifySignature**](PdfApi.md#getVerifySignature) | **GET** /pdf/\{name}/verifySignature | Verify signature document.
[**getWebInStorageToPdf**](PdfApi.md#getWebInStorageToPdf) | **GET** /pdf/create/web | Convert web page to PDF format and return resulting file in response. 
[**getWordsPerPage**](PdfApi.md#getWordsPerPage) | **GET** /pdf/\{name}/pages/wordCount | Get number of words per document page.
[**getXfaPdfInStorageToAcroForm**](PdfApi.md#getXfaPdfInStorageToAcroForm) | **GET** /pdf/\{name}/convert/xfatoacroform | Converts PDF document which contains XFA form (located on storage) to PDF with AcroForm and returns resulting file response content
[**getXmlInStorageToPdf**](PdfApi.md#getXmlInStorageToPdf) | **GET** /pdf/create/xml | Convert XML file (located on storage) to PDF format and return resulting file in response. 
[**getXmpMetadataJson**](PdfApi.md#getXmpMetadataJson) | **GET** /pdf/\{name}/xmpmetadata/json | Gets document XMP Metadata as JSON.
[**getXmpMetadataXml**](PdfApi.md#getXmpMetadataXml) | **GET** /pdf/\{name}/xmpmetadata/xml | Gets document XMP Metadata as XML file.
[**getXpsInStorageToPdf**](PdfApi.md#getXpsInStorageToPdf) | **GET** /pdf/create/xps | Convert XPS file (located on storage) to PDF format and return resulting file in response. 
[**getXslFoInStorageToPdf**](PdfApi.md#getXslFoInStorageToPdf) | **GET** /pdf/create/xslfo | Convert XslFo file (located on storage) to PDF format and return resulting file in response. 
[**moveFile**](PdfApi.md#moveFile) | **PUT** /pdf/storage/file/move/\{srcPath} | Move file
[**moveFolder**](PdfApi.md#moveFolder) | **PUT** /pdf/storage/folder/move/\{srcPath} | Move folder
[**objectExists**](PdfApi.md#objectExists) | **GET** /pdf/storage/exist/\{path} | Check if file or folder exists
[**postAddDocumentAttachment**](PdfApi.md#postAddDocumentAttachment) | **POST** /pdf/\{name}/attachments | Adds a file attachment to the PDF document.
[**postAppendDocument**](PdfApi.md#postAppendDocument) | **POST** /pdf/\{name}/appendDocument | Append document to existing one.
[**postBookmark**](PdfApi.md#postBookmark) | **POST** /pdf/\{name}/bookmarks/bookmark/\{bookmarkPath} | Add document bookmarks.
[**postChangePasswordDocumentInStorage**](PdfApi.md#postChangePasswordDocumentInStorage) | **POST** /pdf/\{name}/changepassword | Change document password in storage.
[**postCheckBoxFields**](PdfApi.md#postCheckBoxFields) | **POST** /pdf/\{name}/fields/checkbox | Add document checkbox fields.
[**postComboBoxFields**](PdfApi.md#postComboBoxFields) | **POST** /pdf/\{name}/fields/combobox | Add document combobox fields.
[**postComparePdf**](PdfApi.md#postComparePdf) | **POST** /pdf/compare | Compare two PDF documents.
[**postCreateDocument**](PdfApi.md#postCreateDocument) | **POST** /pdf/\{name} | Create empty document.
[**postCreateField**](PdfApi.md#postCreateField) | **POST** /pdf/\{name}/fields | Create field.
[**postDecryptDocumentInStorage**](PdfApi.md#postDecryptDocumentInStorage) | **POST** /pdf/\{name}/decrypt | Decrypt document in storage.
[**postDocumentImageFooter**](PdfApi.md#postDocumentImageFooter) | **POST** /pdf/\{name}/footer/image | Add document image footer.
[**postDocumentImageHeader**](PdfApi.md#postDocumentImageHeader) | **POST** /pdf/\{name}/header/image | Add document image header.
[**postDocumentImageStamps**](PdfApi.md#postDocumentImageStamps) | **POST** /pdf/\{name}/stamps/image | Add document pages image stamps.
[**postDocumentImageStampsPageSpecified**](PdfApi.md#postDocumentImageStampsPageSpecified) | **POST** /pdf/\{name}/stamps/image/pagespecified | Add document image stamps to specified pages.
[**postDocumentPageNumberStamps**](PdfApi.md#postDocumentPageNumberStamps) | **POST** /pdf/\{name}/stamps/pagenumber | Add document page number stamps.
[**postDocumentPagesCrop**](PdfApi.md#postDocumentPagesCrop) | **POST** /pdf/\{name}/crop | Crop PDF document pages.
[**postDocumentPagesResize**](PdfApi.md#postDocumentPagesResize) | **POST** /pdf/\{name}/resize | Rsize PDF document.
[**postDocumentPagesRotate**](PdfApi.md#postDocumentPagesRotate) | **POST** /pdf/\{name}/rotate | Rotate PDF document.
[**postDocumentTextFooter**](PdfApi.md#postDocumentTextFooter) | **POST** /pdf/\{name}/footer/text | Add document text footer.
[**postDocumentTextHeader**](PdfApi.md#postDocumentTextHeader) | **POST** /pdf/\{name}/header/text | Add document text header.
[**postDocumentTextReplace**](PdfApi.md#postDocumentTextReplace) | **POST** /pdf/\{name}/text/replace | Document&#39;s replace text method.
[**postDocumentTextStamps**](PdfApi.md#postDocumentTextStamps) | **POST** /pdf/\{name}/stamps/text | Add document pages text stamps.
[**postDocumentTextStampsPageSpecified**](PdfApi.md#postDocumentTextStampsPageSpecified) | **POST** /pdf/\{name}/stamps/text/pagespecified | Add document text stamps to specified pages.
[**postEncryptDocumentInStorage**](PdfApi.md#postEncryptDocumentInStorage) | **POST** /pdf/\{name}/encrypt | Encrypt document in storage.
[**postFlattenDocument**](PdfApi.md#postFlattenDocument) | **POST** /pdf/\{name}/flatten | Flatten the document.
[**postHtmlToPdf**](PdfApi.md#postHtmlToPdf) | **POST** /pdf/create/html | Convert HTML file (zip archive in request content) to PDF format and return resulting file in response. 
[**postImportFieldsFromFdf**](PdfApi.md#postImportFieldsFromFdf) | **POST** /pdf/\{name}/import/fdf | Update fields from FDF file in request.
[**postImportFieldsFromXfdf**](PdfApi.md#postImportFieldsFromXfdf) | **POST** /pdf/\{name}/import/xfdf | Update fields from XFDF file in request.
[**postImportFieldsFromXml**](PdfApi.md#postImportFieldsFromXml) | **POST** /pdf/\{name}/import/xml | Update fields from XML file in request.
[**postInsertImage**](PdfApi.md#postInsertImage) | **POST** /pdf/\{name}/pages/\{pageNumber}/images | Insert image to document page.
[**postListBoxFields**](PdfApi.md#postListBoxFields) | **POST** /pdf/\{name}/fields/listbox | Add document listbox fields.
[**postMovePage**](PdfApi.md#postMovePage) | **POST** /pdf/\{name}/pages/\{pageNumber}/movePage | Move page to new position.
[**postOptimizeDocument**](PdfApi.md#postOptimizeDocument) | **POST** /pdf/\{name}/optimize | Optimize document.
[**postOrganizeDocument**](PdfApi.md#postOrganizeDocument) | **POST** /pdf/\{name}/organize | Merge selected pages of a document.
[**postOrganizeDocuments**](PdfApi.md#postOrganizeDocuments) | **POST** /pdf/organize | Merge selected pages of different documents.
[**postPageCaretAnnotations**](PdfApi.md#postPageCaretAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/caret | Add document page caret annotations.
[**postPageCertify**](PdfApi.md#postPageCertify) | **POST** /pdf/\{name}/pages/\{pageNumber}/certify | Certify document page.
[**postPageCircleAnnotations**](PdfApi.md#postPageCircleAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/circle | Add document page circle annotations.
[**postPageFileAttachmentAnnotations**](PdfApi.md#postPageFileAttachmentAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/fileattachment | Add document page FileAttachment annotations.
[**postPageFreeTextAnnotations**](PdfApi.md#postPageFreeTextAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/freetext | Add document page free text annotations.
[**postPageHighlightAnnotations**](PdfApi.md#postPageHighlightAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/highlight | Add document page highlight annotations.
[**postPageImageStamps**](PdfApi.md#postPageImageStamps) | **POST** /pdf/\{name}/pages/\{pageNumber}/stamps/image | Add document page image stamps.
[**postPageInkAnnotations**](PdfApi.md#postPageInkAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/ink | Add document page ink annotations.
[**postPageLineAnnotations**](PdfApi.md#postPageLineAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/line | Add document page line annotations.
[**postPageLinkAnnotations**](PdfApi.md#postPageLinkAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/links | Add document page link annotations.
[**postPageMovieAnnotations**](PdfApi.md#postPageMovieAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/movie | Add document page movie annotations.
[**postPagePdfPageStamps**](PdfApi.md#postPagePdfPageStamps) | **POST** /pdf/\{name}/pages/\{pageNumber}/stamps/pdfpage | Add document pdf page stamps.
[**postPagePolyLineAnnotations**](PdfApi.md#postPagePolyLineAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/polyline | Add document page polyline annotations.
[**postPagePolygonAnnotations**](PdfApi.md#postPagePolygonAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/polygon | Add document page polygon annotations.
[**postPageRedactionAnnotations**](PdfApi.md#postPageRedactionAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/redaction | Add document page redaction annotations.
[**postPageScreenAnnotations**](PdfApi.md#postPageScreenAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/screen | Add document page screen annotations.
[**postPageSoundAnnotations**](PdfApi.md#postPageSoundAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/sound | Add document page sound annotations.
[**postPageSquareAnnotations**](PdfApi.md#postPageSquareAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/square | Add document page square annotations.
[**postPageSquigglyAnnotations**](PdfApi.md#postPageSquigglyAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/squiggly | Add document page squiggly annotations.
[**postPageStampAnnotations**](PdfApi.md#postPageStampAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/stamp | Add document page stamp annotations.
[**postPageStrikeOutAnnotations**](PdfApi.md#postPageStrikeOutAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/strikeout | Add document page StrikeOut annotations.
[**postPageTables**](PdfApi.md#postPageTables) | **POST** /pdf/\{name}/pages/\{pageNumber}/tables | Add document page tables.
[**postPageTextAnnotations**](PdfApi.md#postPageTextAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/text | Add document page text annotations.
[**postPageTextReplace**](PdfApi.md#postPageTextReplace) | **POST** /pdf/\{name}/pages/\{pageNumber}/text/replace | Page&#39;s replace text method.
[**postPageTextStamps**](PdfApi.md#postPageTextStamps) | **POST** /pdf/\{name}/pages/\{pageNumber}/stamps/text | Add document page text stamps.
[**postPageUnderlineAnnotations**](PdfApi.md#postPageUnderlineAnnotations) | **POST** /pdf/\{name}/pages/\{pageNumber}/annotations/underline | Add document page underline annotations.
[**postPdfToXlsx**](PdfApi.md#postPdfToXlsx) | **POST** /pdf/convert/xlsx | Converts PDF document (in request content) to XLSX format and uploads and returns resulting file in response content.
[**postPopupAnnotation**](PdfApi.md#postPopupAnnotation) | **POST** /pdf/\{name}/annotations/\{annotationId}/popup | Add document popup annotations.
[**postRadioButtonFields**](PdfApi.md#postRadioButtonFields) | **POST** /pdf/\{name}/fields/radiobutton | Add document RadioButton fields.
[**postSignDocument**](PdfApi.md#postSignDocument) | **POST** /pdf/\{name}/sign | Sign document.
[**postSignPage**](PdfApi.md#postSignPage) | **POST** /pdf/\{name}/pages/\{pageNumber}/sign | Sign page.
[**postSignatureField**](PdfApi.md#postSignatureField) | **POST** /pdf/\{name}/fields/signature | Add document signature field.
[**postSplitDocument**](PdfApi.md#postSplitDocument) | **POST** /pdf/\{name}/split | Split document to parts.
[**postSplitRangePdfDocument**](PdfApi.md#postSplitRangePdfDocument) | **POST** /pdf/\{name}/splitrangepdf | Split document into ranges.
[**postTextBoxFields**](PdfApi.md#postTextBoxFields) | **POST** /pdf/\{name}/fields/textbox | Add document text box fields.
[**postXmpMetadata**](PdfApi.md#postXmpMetadata) | **POST** /pdf/\{name}/xmpmetadata | Add or remove XMP Metadata properties.
[**putAddNewPage**](PdfApi.md#putAddNewPage) | **PUT** /pdf/\{name}/pages | Add new page to end of the document.
[**putAddText**](PdfApi.md#putAddText) | **PUT** /pdf/\{name}/pages/\{pageNumber}/text | Add text to PDF document page.
[**putAnnotationsFlatten**](PdfApi.md#putAnnotationsFlatten) | **PUT** /pdf/\{name}/annotations/flatten | Flattens the annotations of the specified types
[**putApsInStorageToPdf**](PdfApi.md#putApsInStorageToPdf) | **PUT** /pdf/\{name}/create/aps | Convert APS file (located on storage) to PDF format and upload resulting file to storage. 
[**putBookmark**](PdfApi.md#putBookmark) | **PUT** /pdf/\{name}/bookmarks/bookmark/\{bookmarkPath} | Update document bookmark.
[**putCaretAnnotation**](PdfApi.md#putCaretAnnotation) | **PUT** /pdf/\{name}/annotations/caret/\{annotationId} | Replace document caret annotation
[**putChangePasswordDocument**](PdfApi.md#putChangePasswordDocument) | **PUT** /pdf/changepassword | Change document password from content.
[**putCheckBoxField**](PdfApi.md#putCheckBoxField) | **PUT** /pdf/\{name}/fields/checkbox/\{fieldName} | Replace document checkbox field
[**putCircleAnnotation**](PdfApi.md#putCircleAnnotation) | **PUT** /pdf/\{name}/annotations/circle/\{annotationId} | Replace document circle annotation
[**putComboBoxField**](PdfApi.md#putComboBoxField) | **PUT** /pdf/\{name}/fields/combobox/\{fieldName} | Replace document combobox field
[**putCreateDocument**](PdfApi.md#putCreateDocument) | **PUT** /pdf/\{name} | Create empty document.
[**putCreatePdfFromLayer**](PdfApi.md#putCreatePdfFromLayer) | **PUT** /pdf/\{name}/layers | Create a separate PDF from a PDF Layer and upload resulting file to storage.
[**putDecryptDocument**](PdfApi.md#putDecryptDocument) | **PUT** /pdf/decrypt | Decrypt document from content.
[**putDocumentDisplayProperties**](PdfApi.md#putDocumentDisplayProperties) | **PUT** /pdf/\{name}/displayproperties | Update document display properties.
[**putEncryptDocument**](PdfApi.md#putEncryptDocument) | **PUT** /pdf/encrypt | Encrypt document from content.
[**putEpubInStorageToPdf**](PdfApi.md#putEpubInStorageToPdf) | **PUT** /pdf/\{name}/create/epub | Convert EPUB file (located on storage) to PDF format and upload resulting file to storage. 
[**putExportFieldsFromPdfToFdfInStorage**](PdfApi.md#putExportFieldsFromPdfToFdfInStorage) | **PUT** /pdf/\{name}/export/fdf | Export fields from from PDF in storage to FDF file in storage.
[**putExportFieldsFromPdfToXfdfInStorage**](PdfApi.md#putExportFieldsFromPdfToXfdfInStorage) | **PUT** /pdf/\{name}/export/xfdf | Export fields from from PDF in storage to XFDF file in storage.
[**putExportFieldsFromPdfToXmlInStorage**](PdfApi.md#putExportFieldsFromPdfToXmlInStorage) | **PUT** /pdf/\{name}/export/xml | Export fields from from PDF in storage to XML file in storage.
[**putFieldsFlatten**](PdfApi.md#putFieldsFlatten) | **PUT** /pdf/\{name}/fields/flatten | Flatten form fields in document.
[**putFileAttachmentAnnotation**](PdfApi.md#putFileAttachmentAnnotation) | **PUT** /pdf/\{name}/annotations/fileattachment/\{annotationId} | Replace document FileAttachment annotation
[**putFileAttachmentAnnotationDataExtract**](PdfApi.md#putFileAttachmentAnnotationDataExtract) | **PUT** /pdf/\{name}/annotations/fileattachment/\{annotationId}/data/extract | Extract document FileAttachment annotation content to storage
[**putFreeTextAnnotation**](PdfApi.md#putFreeTextAnnotation) | **PUT** /pdf/\{name}/annotations/freetext/\{annotationId} | Replace document free text annotation
[**putHighlightAnnotation**](PdfApi.md#putHighlightAnnotation) | **PUT** /pdf/\{name}/annotations/highlight/\{annotationId} | Replace document highlight annotation
[**putHtmlInStorageToPdf**](PdfApi.md#putHtmlInStorageToPdf) | **PUT** /pdf/\{name}/create/html | Convert HTML file (located on storage) to PDF format and upload resulting file to storage. 
[**putImageExtractAsGif**](PdfApi.md#putImageExtractAsGif) | **PUT** /pdf/\{name}/images/\{imageId}/extract/gif | Extract document image in GIF format to folder
[**putImageExtractAsJpeg**](PdfApi.md#putImageExtractAsJpeg) | **PUT** /pdf/\{name}/images/\{imageId}/extract/jpeg | Extract document image in JPEG format to folder
[**putImageExtractAsPng**](PdfApi.md#putImageExtractAsPng) | **PUT** /pdf/\{name}/images/\{imageId}/extract/png | Extract document image in PNG format to folder
[**putImageExtractAsTiff**](PdfApi.md#putImageExtractAsTiff) | **PUT** /pdf/\{name}/images/\{imageId}/extract/tiff | Extract document image in TIFF format to folder
[**putImageInStorageToPdf**](PdfApi.md#putImageInStorageToPdf) | **PUT** /pdf/\{name}/create/images | Convert image file (located on storage) to PDF format and upload resulting file to storage. 
[**putImagesExtractAsGif**](PdfApi.md#putImagesExtractAsGif) | **PUT** /pdf/\{name}/pages/\{pageNumber}/images/extract/gif | Extract document images in GIF format to folder.
[**putImagesExtractAsJpeg**](PdfApi.md#putImagesExtractAsJpeg) | **PUT** /pdf/\{name}/pages/\{pageNumber}/images/extract/jpeg | Extract document images in JPEG format to folder.
[**putImagesExtractAsPng**](PdfApi.md#putImagesExtractAsPng) | **PUT** /pdf/\{name}/pages/\{pageNumber}/images/extract/png | Extract document images in PNG format to folder.
[**putImagesExtractAsTiff**](PdfApi.md#putImagesExtractAsTiff) | **PUT** /pdf/\{name}/pages/\{pageNumber}/images/extract/tiff | Extract document images in TIFF format to folder.
[**putImportFieldsFromFdfInStorage**](PdfApi.md#putImportFieldsFromFdfInStorage) | **PUT** /pdf/\{name}/import/fdf | Update fields from FDF file in storage.
[**putImportFieldsFromXfdfInStorage**](PdfApi.md#putImportFieldsFromXfdfInStorage) | **PUT** /pdf/\{name}/import/xfdf | Update fields from XFDF file in storage.
[**putImportFieldsFromXmlInStorage**](PdfApi.md#putImportFieldsFromXmlInStorage) | **PUT** /pdf/\{name}/import/xml | Update fields from XML file in storage.
[**putInkAnnotation**](PdfApi.md#putInkAnnotation) | **PUT** /pdf/\{name}/annotations/ink/\{annotationId} | Replace document ink annotation
[**putLineAnnotation**](PdfApi.md#putLineAnnotation) | **PUT** /pdf/\{name}/annotations/line/\{annotationId} | Replace document line annotation
[**putLinkAnnotation**](PdfApi.md#putLinkAnnotation) | **PUT** /pdf/\{name}/links/\{linkId} | Replace document page link annotations
[**putListBoxField**](PdfApi.md#putListBoxField) | **PUT** /pdf/\{name}/fields/listbox/\{fieldName} | Replace document listbox field
[**putMarkdownInStorageToPdf**](PdfApi.md#putMarkdownInStorageToPdf) | **PUT** /pdf/\{name}/create/markdown | Convert MD file (located on storage) to PDF format and upload resulting file to storage. 
[**putMergeDocuments**](PdfApi.md#putMergeDocuments) | **PUT** /pdf/\{name}/merge | Merge a list of documents.
[**putMhtInStorageToPdf**](PdfApi.md#putMhtInStorageToPdf) | **PUT** /pdf/\{name}/create/mht | Convert MHT file (located on storage) to PDF format and upload resulting file to storage. 
[**putMovieAnnotation**](PdfApi.md#putMovieAnnotation) | **PUT** /pdf/\{name}/annotations/movie/\{annotationId} | Replace document movie annotation
[**putPageAddStamp**](PdfApi.md#putPageAddStamp) | **PUT** /pdf/\{name}/pages/\{pageNumber}/stamp | Add page stamp.
[**putPageConvertToBmp**](PdfApi.md#putPageConvertToBmp) | **PUT** /pdf/\{name}/pages/\{pageNumber}/convert/bmp | Convert document page to bmp image and upload resulting file to storage.
[**putPageConvertToEmf**](PdfApi.md#putPageConvertToEmf) | **PUT** /pdf/\{name}/pages/\{pageNumber}/convert/emf | Convert document page to emf image and upload resulting file to storage.
[**putPageConvertToGif**](PdfApi.md#putPageConvertToGif) | **PUT** /pdf/\{name}/pages/\{pageNumber}/convert/gif | Convert document page to gif image and upload resulting file to storage.
[**putPageConvertToJpeg**](PdfApi.md#putPageConvertToJpeg) | **PUT** /pdf/\{name}/pages/\{pageNumber}/convert/jpeg | Convert document page to Jpeg image and upload resulting file to storage.
[**putPageConvertToPng**](PdfApi.md#putPageConvertToPng) | **PUT** /pdf/\{name}/pages/\{pageNumber}/convert/png | Convert document page to png image and upload resulting file to storage.
[**putPageConvertToTiff**](PdfApi.md#putPageConvertToTiff) | **PUT** /pdf/\{name}/pages/\{pageNumber}/convert/tiff | Convert document page to Tiff image and upload resulting file to storage.
[**putPclInStorageToPdf**](PdfApi.md#putPclInStorageToPdf) | **PUT** /pdf/\{name}/create/pcl | Convert PCL file (located on storage) to PDF format and upload resulting file to storage. 
[**putPdfAInStorageToPdf**](PdfApi.md#putPdfAInStorageToPdf) | **PUT** /pdf/\{name}/create/pdfa | Convert PDFA file (located on storage) to PDF format and upload resulting file to storage. 
[**putPdfInRequestToAps**](PdfApi.md#putPdfInRequestToAps) | **PUT** /pdf/convert/aps | Converts PDF document (in request content) to APS format and uploads resulting file to storage.
[**putPdfInRequestToDoc**](PdfApi.md#putPdfInRequestToDoc) | **PUT** /pdf/convert/doc | Converts PDF document (in request content) to DOC format and uploads resulting file to storage.
[**putPdfInRequestToEpub**](PdfApi.md#putPdfInRequestToEpub) | **PUT** /pdf/convert/epub | Converts PDF document (in request content) to EPUB format and uploads resulting file to storage.
[**putPdfInRequestToHtml**](PdfApi.md#putPdfInRequestToHtml) | **PUT** /pdf/convert/html | Converts PDF document (in request content) to Html format and uploads resulting file to storage.
[**putPdfInRequestToMobiXml**](PdfApi.md#putPdfInRequestToMobiXml) | **PUT** /pdf/convert/mobixml | Converts PDF document (in request content) to MOBIXML format and uploads resulting ZIP archive file to storage.
[**putPdfInRequestToPdfA**](PdfApi.md#putPdfInRequestToPdfA) | **PUT** /pdf/convert/pdfa | Converts PDF document (in request content) to PdfA format and uploads resulting file to storage.
[**putPdfInRequestToPptx**](PdfApi.md#putPdfInRequestToPptx) | **PUT** /pdf/convert/pptx | Converts PDF document (in request content) to PPTX format and uploads resulting file to storage.
[**putPdfInRequestToSvg**](PdfApi.md#putPdfInRequestToSvg) | **PUT** /pdf/convert/svg | Converts PDF document (in request content) to SVG format and uploads resulting file to storage.
[**putPdfInRequestToTeX**](PdfApi.md#putPdfInRequestToTeX) | **PUT** /pdf/convert/tex | Converts PDF document (in request content) to TeX format and uploads resulting file to storage.
[**putPdfInRequestToTiff**](PdfApi.md#putPdfInRequestToTiff) | **PUT** /pdf/convert/tiff | Converts PDF document (in request content) to TIFF format and uploads resulting file to storage.
[**putPdfInRequestToXls**](PdfApi.md#putPdfInRequestToXls) | **PUT** /pdf/convert/xls | Converts PDF document (in request content) to XLS format and uploads resulting file to storage.
[**putPdfInRequestToXlsx**](PdfApi.md#putPdfInRequestToXlsx) | **PUT** /pdf/convert/xlsx | Converts PDF document (in request content) to XLSX format and uploads resulting file to storage.
[**putPdfInRequestToXml**](PdfApi.md#putPdfInRequestToXml) | **PUT** /pdf/convert/xml | Converts PDF document (in request content) to XML format and uploads resulting file to storage.
[**putPdfInRequestToXps**](PdfApi.md#putPdfInRequestToXps) | **PUT** /pdf/convert/xps | Converts PDF document (in request content) to XPS format and uploads resulting file to storage.
[**putPdfInStorageToAps**](PdfApi.md#putPdfInStorageToAps) | **PUT** /pdf/\{name}/convert/aps | Converts PDF document (located on storage) to APS format and uploads resulting file to storage
[**putPdfInStorageToDoc**](PdfApi.md#putPdfInStorageToDoc) | **PUT** /pdf/\{name}/convert/doc | Converts PDF document (located on storage) to DOC format and uploads resulting file to storage.
[**putPdfInStorageToEpub**](PdfApi.md#putPdfInStorageToEpub) | **PUT** /pdf/\{name}/convert/epub | Converts PDF document (located on storage) to EPUB format and uploads resulting file to storage
[**putPdfInStorageToHtml**](PdfApi.md#putPdfInStorageToHtml) | **PUT** /pdf/\{name}/convert/html | Converts PDF document (located on storage) to Html format and uploads resulting file to storage
[**putPdfInStorageToMobiXml**](PdfApi.md#putPdfInStorageToMobiXml) | **PUT** /pdf/\{name}/convert/mobixml | Converts PDF document (located on storage) to MOBIXML format and uploads resulting ZIP archive file to storage
[**putPdfInStorageToPdfA**](PdfApi.md#putPdfInStorageToPdfA) | **PUT** /pdf/\{name}/convert/pdfa | Converts PDF document (located on storage) to PdfA format and uploads resulting file to storage
[**putPdfInStorageToPptx**](PdfApi.md#putPdfInStorageToPptx) | **PUT** /pdf/\{name}/convert/pptx | Converts PDF document (located on storage) to PPTX format and uploads resulting file to storage
[**putPdfInStorageToSvg**](PdfApi.md#putPdfInStorageToSvg) | **PUT** /pdf/\{name}/convert/svg | Converts PDF document (located on storage) to SVG format and uploads resulting file to storage
[**putPdfInStorageToTeX**](PdfApi.md#putPdfInStorageToTeX) | **PUT** /pdf/\{name}/convert/tex | Converts PDF document (located on storage) to TeX format and uploads resulting file to storage
[**putPdfInStorageToTiff**](PdfApi.md#putPdfInStorageToTiff) | **PUT** /pdf/\{name}/convert/tiff | Converts PDF document (located on storage) to TIFF format and uploads resulting file to storage
[**putPdfInStorageToXls**](PdfApi.md#putPdfInStorageToXls) | **PUT** /pdf/\{name}/convert/xls | Converts PDF document (located on storage) to XLS format and uploads resulting file to storage
[**putPdfInStorageToXlsx**](PdfApi.md#putPdfInStorageToXlsx) | **PUT** /pdf/\{name}/convert/xlsx | Converts PDF document (located on storage) to XLSX format and uploads resulting file to storage
[**putPdfInStorageToXml**](PdfApi.md#putPdfInStorageToXml) | **PUT** /pdf/\{name}/convert/xml | Converts PDF document (located on storage) to XML format and uploads resulting file to storage
[**putPdfInStorageToXps**](PdfApi.md#putPdfInStorageToXps) | **PUT** /pdf/\{name}/convert/xps | Converts PDF document (located on storage) to XPS format and uploads resulting file to storage
[**putPolyLineAnnotation**](PdfApi.md#putPolyLineAnnotation) | **PUT** /pdf/\{name}/annotations/polyline/\{annotationId} | Replace document polyline annotation
[**putPolygonAnnotation**](PdfApi.md#putPolygonAnnotation) | **PUT** /pdf/\{name}/annotations/polygon/\{annotationId} | Replace document polygon annotation
[**putPopupAnnotation**](PdfApi.md#putPopupAnnotation) | **PUT** /pdf/\{name}/annotations/popup/\{annotationId} | Replace document popup annotation
[**putPrivileges**](PdfApi.md#putPrivileges) | **PUT** /pdf/\{name}/privileges | Update privilege document.
[**putPsInStorageToPdf**](PdfApi.md#putPsInStorageToPdf) | **PUT** /pdf/\{name}/create/ps | Convert PS file (located on storage) to PDF format and upload resulting file to storage. 
[**putRadioButtonField**](PdfApi.md#putRadioButtonField) | **PUT** /pdf/\{name}/fields/radiobutton/\{fieldName} | Replace document RadioButton field
[**putRedactionAnnotation**](PdfApi.md#putRedactionAnnotation) | **PUT** /pdf/\{name}/annotations/redaction/\{annotationId} | Replace document redaction annotation
[**putReplaceImage**](PdfApi.md#putReplaceImage) | **PUT** /pdf/\{name}/images/\{imageId} | Replace document image.
[**putReplaceMultipleImage**](PdfApi.md#putReplaceMultipleImage) | **PUT** /pdf/\{name}/images/replace | Replace document multiple image.
[**putScreenAnnotation**](PdfApi.md#putScreenAnnotation) | **PUT** /pdf/\{name}/annotations/screen/\{annotationId} | Replace document screen annotation
[**putScreenAnnotationDataExtract**](PdfApi.md#putScreenAnnotationDataExtract) | **PUT** /pdf/\{name}/annotations/screen/\{annotationId}/data/extract | Extract document screen annotation content to storage
[**putSearchableDocument**](PdfApi.md#putSearchableDocument) | **PUT** /pdf/\{name}/ocr | Create searchable PDF document. Generate OCR layer for images in input PDF document.
[**putSetProperty**](PdfApi.md#putSetProperty) | **PUT** /pdf/\{name}/documentproperties/\{propertyName} | Add/update document property.
[**putSignatureField**](PdfApi.md#putSignatureField) | **PUT** /pdf/\{name}/fields/signature/\{fieldName} | Replace document signature field.
[**putSoundAnnotation**](PdfApi.md#putSoundAnnotation) | **PUT** /pdf/\{name}/annotations/sound/\{annotationId} | Replace document sound annotation
[**putSoundAnnotationDataExtract**](PdfApi.md#putSoundAnnotationDataExtract) | **PUT** /pdf/\{name}/annotations/sound/\{annotationId}/data/extract | Extract document sound annotation content to storage
[**putSquareAnnotation**](PdfApi.md#putSquareAnnotation) | **PUT** /pdf/\{name}/annotations/square/\{annotationId} | Replace document square annotation
[**putSquigglyAnnotation**](PdfApi.md#putSquigglyAnnotation) | **PUT** /pdf/\{name}/annotations/squiggly/\{annotationId} | Replace document squiggly annotation
[**putStampAnnotation**](PdfApi.md#putStampAnnotation) | **PUT** /pdf/\{name}/annotations/stamp/\{annotationId} | Replace document stamp annotation
[**putStampAnnotationDataExtract**](PdfApi.md#putStampAnnotationDataExtract) | **PUT** /pdf/\{name}/annotations/stamp/\{annotationId}/data/extract | Extract document stamp annotation content to storage
[**putStrikeOutAnnotation**](PdfApi.md#putStrikeOutAnnotation) | **PUT** /pdf/\{name}/annotations/strikeout/\{annotationId} | Replace document StrikeOut annotation
[**putSvgInStorageToPdf**](PdfApi.md#putSvgInStorageToPdf) | **PUT** /pdf/\{name}/create/svg | Convert SVG file (located on storage) to PDF format and upload resulting file to storage. 
[**putTable**](PdfApi.md#putTable) | **PUT** /pdf/\{name}/tables/\{tableId} | Replace document page table.
[**putTeXInStorageToPdf**](PdfApi.md#putTeXInStorageToPdf) | **PUT** /pdf/\{name}/create/tex | Convert TeX file (located on storage) to PDF format and upload resulting file to storage. 
[**putTextAnnotation**](PdfApi.md#putTextAnnotation) | **PUT** /pdf/\{name}/annotations/text/\{annotationId} | Replace document text annotation
[**putTextBoxField**](PdfApi.md#putTextBoxField) | **PUT** /pdf/\{name}/fields/textbox/\{fieldName} | Replace document text box field
[**putUnderlineAnnotation**](PdfApi.md#putUnderlineAnnotation) | **PUT** /pdf/\{name}/annotations/underline/\{annotationId} | Replace document underline annotation
[**putUpdateField**](PdfApi.md#putUpdateField) | **PUT** /pdf/\{name}/fields/\{fieldName} | Update field.
[**putUpdateFields**](PdfApi.md#putUpdateFields) | **PUT** /pdf/\{name}/fields | Update fields.
[**putWebInStorageToPdf**](PdfApi.md#putWebInStorageToPdf) | **PUT** /pdf/\{name}/create/web | Convert web page to PDF format and upload resulting file to storage. 
[**putXfaPdfInRequestToAcroForm**](PdfApi.md#putXfaPdfInRequestToAcroForm) | **PUT** /pdf/convert/xfatoacroform | Converts PDF document which contains XFA form (in request content) to PDF with AcroForm and uploads resulting file to storage.
[**putXfaPdfInStorageToAcroForm**](PdfApi.md#putXfaPdfInStorageToAcroForm) | **PUT** /pdf/\{name}/convert/xfatoacroform | Converts PDF document which contains XFA form (located on storage) to PDF with AcroForm and uploads resulting file to storage
[**putXmlInStorageToPdf**](PdfApi.md#putXmlInStorageToPdf) | **PUT** /pdf/\{name}/create/xml | Convert XML file (located on storage) to PDF format and upload resulting file to storage. 
[**putXpsInStorageToPdf**](PdfApi.md#putXpsInStorageToPdf) | **PUT** /pdf/\{name}/create/xps | Convert XPS file (located on storage) to PDF format and upload resulting file to storage. 
[**putXslFoInStorageToPdf**](PdfApi.md#putXslFoInStorageToPdf) | **PUT** /pdf/\{name}/create/xslfo | Convert XslFo file (located on storage) to PDF format and upload resulting file to storage. 
[**storageExists**](PdfApi.md#storageExists) | **GET** /pdf/storage/\{storageName}/exist | Check if storage exists
[**uploadFile**](PdfApi.md#uploadFile) | **PUT** /pdf/storage/file/\{path} | Upload file


<a name="copyFile"></a>
# **copyFile**
> copyFile(srcPath, destPath, srcStorageName, destStorageName, versionId)

Copy file

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
 **destPath** | **String**| Destination file path |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to copy | [optional]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyFolder"></a>
# **copyFolder**
> copyFolder(srcPath, destPath, srcStorageName, destStorageName)

Copy folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
 **destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFolder"></a>
# **createFolder**
> createFolder(path, storageName)

Create the folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path to create e.g. &#39;folder_1/folder_2/&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAnnotation"></a>
# **deleteAnnotation**
> AsposeResponse deleteAnnotation(name, annotationId, storage, folder)

Delete document annotation by ID

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBookmark"></a>
# **deleteBookmark**
> AsposeResponse deleteBookmark(name, bookmarkPath, folder, storage, password)

Delete document bookmark by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **bookmarkPath** | **String**| The bookmark path. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocumentAnnotations"></a>
# **deleteDocumentAnnotations**
> AsposeResponse deleteDocumentAnnotations(name, storage, folder)

Delete all annotations from the document

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocumentBookmarks"></a>
# **deleteDocumentBookmarks**
> AsposeResponse deleteDocumentBookmarks(name, folder, storage, password)

Delete all document bookmarks.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocumentLayer"></a>
# **deleteDocumentLayer**
> AsposeResponse deleteDocumentLayer(name, pageNumber, layerId, folder, storage, passBase64)

Remove document layer.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| Layer page. |
 **layerId** | **String**| Layer Id. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **passBase64** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocumentLinkAnnotations"></a>
# **deleteDocumentLinkAnnotations**
> AsposeResponse deleteDocumentLinkAnnotations(name, storage, folder)

Delete all link annotations from the document

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocumentStamps"></a>
# **deleteDocumentStamps**
> AsposeResponse deleteDocumentStamps(name, storage, folder, password)

Delete all stamps from the document

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocumentTables"></a>
# **deleteDocumentTables**
> AsposeResponse deleteDocumentTables(name, storage, folder)

Delete all tables from the document

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteField"></a>
# **deleteField**
> AsposeResponse deleteField(name, fieldName, storage, folder)

Delete document field by name.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name/ |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFile"></a>
# **deleteFile**
> deleteFile(path, storageName, versionId)

Delete file

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to delete | [optional]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFolder"></a>
# **deleteFolder**
> deleteFolder(path, storageName, recursive)

Delete folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteImage"></a>
# **deleteImage**
> AsposeResponse deleteImage(name, imageId, storage, folder)

Delete image from document page.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLinkAnnotation"></a>
# **deleteLinkAnnotation**
> AsposeResponse deleteLinkAnnotation(name, linkId, storage, folder)

Delete document page link annotation by ID

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **linkId** | **String**| The link ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePage"></a>
# **deletePage**
> AsposeResponse deletePage(name, pageNumber, storage, folder)

Delete document page by its number.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePageAnnotations"></a>
# **deletePageAnnotations**
> AsposeResponse deletePageAnnotations(name, pageNumber, storage, folder)

Delete all annotations from the page

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePageLinkAnnotations"></a>
# **deletePageLinkAnnotations**
> AsposeResponse deletePageLinkAnnotations(name, pageNumber, storage, folder)

Delete all link annotations from the page

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePageStamps"></a>
# **deletePageStamps**
> AsposeResponse deletePageStamps(name, pageNumber, storage, folder, password)

Delete all stamps from the page

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePageTables"></a>
# **deletePageTables**
> AsposeResponse deletePageTables(name, pageNumber, storage, folder)

Delete all tables from the page

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProperties"></a>
# **deleteProperties**
> AsposeResponse deleteProperties(name, storage, folder, password)

Delete custom document properties.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProperty"></a>
# **deleteProperty**
> AsposeResponse deleteProperty(name, propertyName, storage, folder, password)

Delete document property.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **propertyName** | **String**| Property name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStamp"></a>
# **deleteStamp**
> AsposeResponse deleteStamp(name, stampId, storage, folder, password)

Delete document stamp by ID

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **stampId** | **String**| The stamp ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTable"></a>
# **deleteTable**
> AsposeResponse deleteTable(name, tableId, storage, folder)

Delete document table by ID

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tableId** | **String**| The table ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadFile"></a>
# **downloadFile**
> File downloadFile(path, storageName, versionId)

Download file

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to download | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getApsInStorageToPdf"></a>
# **getApsInStorageToPdf**
> File getApsInStorageToPdf(srcPath, storage)

Convert APS file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xps) |
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getBookmark"></a>
# **getBookmark**
> BookmarkResponse getBookmark(name, bookmarkPath, folder, storage, password)

Read document bookmark.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **bookmarkPath** | **String**| The bookmark path. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**BookmarkResponse**](BookmarkResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBookmarks"></a>
# **getBookmarks**
> BookmarksResponse getBookmarks(name, bookmarkPath, folder, storage, password)

Read document bookmarks node list.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **bookmarkPath** | **String**| The bookmark path. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**BookmarksResponse**](BookmarksResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCaretAnnotation"></a>
# **getCaretAnnotation**
> CaretAnnotationResponse getCaretAnnotation(name, annotationId, storage, folder)

Read document page caret annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CaretAnnotationResponse**](CaretAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCheckBoxField"></a>
# **getCheckBoxField**
> CheckBoxFieldResponse getCheckBoxField(name, fieldName, storage, folder)

Read document checkbox field by name.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CheckBoxFieldResponse**](CheckBoxFieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCircleAnnotation"></a>
# **getCircleAnnotation**
> CircleAnnotationResponse getCircleAnnotation(name, annotationId, storage, folder)

Read document page circle annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CircleAnnotationResponse**](CircleAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getComboBoxField"></a>
# **getComboBoxField**
> ComboBoxFieldResponse getComboBoxField(name, fieldName, storage, folder)

Read document combobox field by name.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ComboBoxFieldResponse**](ComboBoxFieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiscUsage"></a>
# **getDiscUsage**
> DiscUsage getDiscUsage(storageName)

Get disc usage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name | [optional]

### Return type

[**DiscUsage**](DiscUsage.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocument"></a>
# **getDocument**
> DocumentResponse getDocument(name, storage, folder, password)

Read common document info.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentAnnotations"></a>
# **getDocumentAnnotations**
> AnnotationsInfoResponse getDocumentAnnotations(name, storage, folder)

Read document page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AnnotationsInfoResponse**](AnnotationsInfoResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentAttachmentByIndex"></a>
# **getDocumentAttachmentByIndex**
> AttachmentResponse getDocumentAttachmentByIndex(name, attachmentIndex, storage, folder)

Read document attachment info by its index.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **attachmentIndex** | **Integer**| The attachment index. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AttachmentResponse**](AttachmentResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentAttachments"></a>
# **getDocumentAttachments**
> AttachmentsResponse getDocumentAttachments(name, storage, folder)

Read document attachments info.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AttachmentsResponse**](AttachmentsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentBookmarks"></a>
# **getDocumentBookmarks**
> BookmarksResponse getDocumentBookmarks(name, folder, storage, password)

Read document bookmarks tree.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**BookmarksResponse**](BookmarksResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentCaretAnnotations"></a>
# **getDocumentCaretAnnotations**
> CaretAnnotationsResponse getDocumentCaretAnnotations(name, storage, folder)

Read document caret annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CaretAnnotationsResponse**](CaretAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentCheckBoxFields"></a>
# **getDocumentCheckBoxFields**
> CheckBoxFieldsResponse getDocumentCheckBoxFields(name, storage, folder)

Read document checkbox fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CheckBoxFieldsResponse**](CheckBoxFieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentCircleAnnotations"></a>
# **getDocumentCircleAnnotations**
> CircleAnnotationsResponse getDocumentCircleAnnotations(name, storage, folder)

Read document circle annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CircleAnnotationsResponse**](CircleAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentComboBoxFields"></a>
# **getDocumentComboBoxFields**
> ComboBoxFieldsResponse getDocumentComboBoxFields(name, storage, folder)

Read document combobox fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ComboBoxFieldsResponse**](ComboBoxFieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentDisplayProperties"></a>
# **getDocumentDisplayProperties**
> DisplayPropertiesResponse getDocumentDisplayProperties(name, storage, folder)

Read document display properties.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **storage** | **String**|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**DisplayPropertiesResponse**](DisplayPropertiesResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentFileAttachmentAnnotations"></a>
# **getDocumentFileAttachmentAnnotations**
> FileAttachmentAnnotationsResponse getDocumentFileAttachmentAnnotations(name, storage, folder)

Read document FileAttachment annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FileAttachmentAnnotationsResponse**](FileAttachmentAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentFreeTextAnnotations"></a>
# **getDocumentFreeTextAnnotations**
> FreeTextAnnotationsResponse getDocumentFreeTextAnnotations(name, storage, folder)

Read document free text annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FreeTextAnnotationsResponse**](FreeTextAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentHighlightAnnotations"></a>
# **getDocumentHighlightAnnotations**
> HighlightAnnotationsResponse getDocumentHighlightAnnotations(name, storage, folder)

Read document highlight annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**HighlightAnnotationsResponse**](HighlightAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentInkAnnotations"></a>
# **getDocumentInkAnnotations**
> InkAnnotationsResponse getDocumentInkAnnotations(name, storage, folder)

Read document ink annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**InkAnnotationsResponse**](InkAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentLayers"></a>
# **getDocumentLayers**
> DocumentLayers getDocumentLayers(name, folder, storage, passBase64)

Gets document layers.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **passBase64** | **String**| The password (Base64). | [optional]

### Return type

[**DocumentLayers**](DocumentLayers.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentLineAnnotations"></a>
# **getDocumentLineAnnotations**
> LineAnnotationsResponse getDocumentLineAnnotations(name, storage, folder)

Read document line annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**LineAnnotationsResponse**](LineAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentListBoxFields"></a>
# **getDocumentListBoxFields**
> ListBoxFieldsResponse getDocumentListBoxFields(name, storage, folder)

Read document listbox fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ListBoxFieldsResponse**](ListBoxFieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentMovieAnnotations"></a>
# **getDocumentMovieAnnotations**
> MovieAnnotationsResponse getDocumentMovieAnnotations(name, storage, folder)

Read document movie annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**MovieAnnotationsResponse**](MovieAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentPolyLineAnnotations"></a>
# **getDocumentPolyLineAnnotations**
> PolyLineAnnotationsResponse getDocumentPolyLineAnnotations(name, storage, folder)

Read document polyline annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PolyLineAnnotationsResponse**](PolyLineAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentPolygonAnnotations"></a>
# **getDocumentPolygonAnnotations**
> PolygonAnnotationsResponse getDocumentPolygonAnnotations(name, storage, folder)

Read document polygon annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PolygonAnnotationsResponse**](PolygonAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentPopupAnnotations"></a>
# **getDocumentPopupAnnotations**
> PopupAnnotationsResponse getDocumentPopupAnnotations(name, storage, folder)

Read document popup annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PopupAnnotationsResponse**](PopupAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentPopupAnnotationsByParent"></a>
# **getDocumentPopupAnnotationsByParent**
> PopupAnnotationsResponse getDocumentPopupAnnotationsByParent(name, annotationId, storage, folder)

Read document popup annotations by parent id.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The parent annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PopupAnnotationsResponse**](PopupAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentProperties"></a>
# **getDocumentProperties**
> DocumentPropertiesResponse getDocumentProperties(name, storage, folder, password)

Read document properties.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**DocumentPropertiesResponse**](DocumentPropertiesResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentProperty"></a>
# **getDocumentProperty**
> DocumentPropertyResponse getDocumentProperty(name, propertyName, storage, folder, password)

Read document property by name.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **propertyName** | **String**| Property name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**DocumentPropertyResponse**](DocumentPropertyResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentRadioButtonFields"></a>
# **getDocumentRadioButtonFields**
> RadioButtonFieldsResponse getDocumentRadioButtonFields(name, storage, folder)

Read document radiobutton fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**RadioButtonFieldsResponse**](RadioButtonFieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentRedactionAnnotations"></a>
# **getDocumentRedactionAnnotations**
> RedactionAnnotationsResponse getDocumentRedactionAnnotations(name, storage, folder)

Read document redaction annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**RedactionAnnotationsResponse**](RedactionAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentScreenAnnotations"></a>
# **getDocumentScreenAnnotations**
> ScreenAnnotationsResponse getDocumentScreenAnnotations(name, storage, folder)

Read document screen annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ScreenAnnotationsResponse**](ScreenAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentSignatureFields"></a>
# **getDocumentSignatureFields**
> SignatureFieldsResponse getDocumentSignatureFields(name, storage, folder)

Read document signature fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SignatureFieldsResponse**](SignatureFieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentSoundAnnotations"></a>
# **getDocumentSoundAnnotations**
> SoundAnnotationsResponse getDocumentSoundAnnotations(name, storage, folder)

Read document sound annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SoundAnnotationsResponse**](SoundAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentSquareAnnotations"></a>
# **getDocumentSquareAnnotations**
> SquareAnnotationsResponse getDocumentSquareAnnotations(name, storage, folder)

Read document square annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SquareAnnotationsResponse**](SquareAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentSquigglyAnnotations"></a>
# **getDocumentSquigglyAnnotations**
> SquigglyAnnotationsResponse getDocumentSquigglyAnnotations(name, storage, folder)

Read document squiggly annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SquigglyAnnotationsResponse**](SquigglyAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentStampAnnotations"></a>
# **getDocumentStampAnnotations**
> StampAnnotationsResponse getDocumentStampAnnotations(name, storage, folder)

Read document stamp annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**StampAnnotationsResponse**](StampAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentStamps"></a>
# **getDocumentStamps**
> StampsInfoResponse getDocumentStamps(name, storage, folder)

Read document stamps.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**StampsInfoResponse**](StampsInfoResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentStrikeOutAnnotations"></a>
# **getDocumentStrikeOutAnnotations**
> StrikeOutAnnotationsResponse getDocumentStrikeOutAnnotations(name, storage, folder)

Read document StrikeOut annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**StrikeOutAnnotationsResponse**](StrikeOutAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentTables"></a>
# **getDocumentTables**
> TablesRecognizedResponse getDocumentTables(name, storage, folder)

Read document tables.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **storage** | **String**|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**TablesRecognizedResponse**](TablesRecognizedResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentTextAnnotations"></a>
# **getDocumentTextAnnotations**
> TextAnnotationsResponse getDocumentTextAnnotations(name, storage, folder)

Read document text annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TextAnnotationsResponse**](TextAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentTextBoxFields"></a>
# **getDocumentTextBoxFields**
> TextBoxFieldsResponse getDocumentTextBoxFields(name, storage, folder)

Read document text box fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TextBoxFieldsResponse**](TextBoxFieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentUnderlineAnnotations"></a>
# **getDocumentUnderlineAnnotations**
> UnderlineAnnotationsResponse getDocumentUnderlineAnnotations(name, storage, folder)

Read document underline annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**UnderlineAnnotationsResponse**](UnderlineAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDownloadDocumentAttachmentByIndex"></a>
# **getDownloadDocumentAttachmentByIndex**
> File getDownloadDocumentAttachmentByIndex(name, attachmentIndex, storage, folder)

Download document attachment content by its index.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **attachmentIndex** | **Integer**| The attachment index. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getEpubInStorageToPdf"></a>
# **getEpubInStorageToPdf**
> File getEpubInStorageToPdf(srcPath, storage)

Convert EPUB file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.epub) |
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getExportFieldsFromPdfToFdfInStorage"></a>
# **getExportFieldsFromPdfToFdfInStorage**
> File getExportFieldsFromPdfToFdfInStorage(name, storage, folder)

Export fields from from PDF in storage to FDF file.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getExportFieldsFromPdfToXfdfInStorage"></a>
# **getExportFieldsFromPdfToXfdfInStorage**
> File getExportFieldsFromPdfToXfdfInStorage(name, storage, folder)

Export fields from from PDF in storage to XFDF file.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getExportFieldsFromPdfToXmlInStorage"></a>
# **getExportFieldsFromPdfToXmlInStorage**
> File getExportFieldsFromPdfToXmlInStorage(name, storage, folder)

Export fields from from PDF in storage to XML file.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getField"></a>
# **getField**
> FieldResponse getField(name, fieldName, storage, folder)

Get document field by name.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name (name should be encoded). |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FieldResponse**](FieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFields"></a>
# **getFields**
> FieldsResponse getFields(name, storage, folder)

Get document fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FieldsResponse**](FieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFileAttachmentAnnotation"></a>
# **getFileAttachmentAnnotation**
> FileAttachmentAnnotationResponse getFileAttachmentAnnotation(name, annotationId, storage, folder)

Read document page FileAttachment annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FileAttachmentAnnotationResponse**](FileAttachmentAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFileAttachmentAnnotationData"></a>
# **getFileAttachmentAnnotationData**
> File getFileAttachmentAnnotationData(name, annotationId, storage, folder)

Read document page FileAttachment annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getFileVersions"></a>
# **getFileVersions**
> FileVersions getFileVersions(path, storageName)

Get file versions

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FileVersions**](FileVersions.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFilesList"></a>
# **getFilesList**
> FilesList getFilesList(path, storageName)

Get all files and folders within a folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesList**](FilesList.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFreeTextAnnotation"></a>
# **getFreeTextAnnotation**
> FreeTextAnnotationResponse getFreeTextAnnotation(name, annotationId, storage, folder)

Read document page free text annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FreeTextAnnotationResponse**](FreeTextAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHighlightAnnotation"></a>
# **getHighlightAnnotation**
> HighlightAnnotationResponse getHighlightAnnotation(name, annotationId, storage, folder)

Read document page highlight annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**HighlightAnnotationResponse**](HighlightAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHtmlInStorageToPdf"></a>
# **getHtmlInStorageToPdf**
> File getHtmlInStorageToPdf(srcPath, htmlFileName, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, storage)

Convert HTML file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.zip) |
 **htmlFileName** | **String**| Name of HTML file in ZIP. | [optional]
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getImage"></a>
# **getImage**
> ImageResponse getImage(name, imageId, storage, folder)

Read document image by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ImageResponse**](ImageResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getImageExtractAsGif"></a>
# **getImageExtractAsGif**
> File getImageExtractAsGif(name, imageId, width, height, storage, folder)

Extract document image in GIF format

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getImageExtractAsJpeg"></a>
# **getImageExtractAsJpeg**
> File getImageExtractAsJpeg(name, imageId, width, height, storage, folder)

Extract document image in JPEG format

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getImageExtractAsPng"></a>
# **getImageExtractAsPng**
> File getImageExtractAsPng(name, imageId, width, height, storage, folder)

Extract document image in PNG format

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getImageExtractAsTiff"></a>
# **getImageExtractAsTiff**
> File getImageExtractAsTiff(name, imageId, width, height, storage, folder)

Extract document image in TIFF format

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getImages"></a>
# **getImages**
> ImagesResponse getImages(name, pageNumber, storage, folder)

Read document images.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ImagesResponse**](ImagesResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getImagesExtractSvg"></a>
# **getImagesExtractSvg**
> SvgImages getImagesExtractSvg(name, pageNumber, storage, folder, passBase64)

Extract SVG images from document page.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **passBase64** | **String**| The password (Base64). | [optional]

### Return type

[**SvgImages**](SvgImages.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getImportFieldsFromFdfInStorage"></a>
# **getImportFieldsFromFdfInStorage**
> File getImportFieldsFromFdfInStorage(name, fdfFilePath, storage, folder)

Update fields from FDF file in storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fdfFilePath** | **String**| The Fdf file path. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getImportFieldsFromXfdfInStorage"></a>
# **getImportFieldsFromXfdfInStorage**
> File getImportFieldsFromXfdfInStorage(name, xfdfFilePath, storage, folder)

Update fields from XFDF file in storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **xfdfFilePath** | **String**| The XFDF file path. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getImportFieldsFromXmlInStorage"></a>
# **getImportFieldsFromXmlInStorage**
> File getImportFieldsFromXmlInStorage(name, xmlFilePath, storage, folder)

Import from XML file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **xmlFilePath** | **String**| Full source filename (ex. /folder1/folder2/template.xml) |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getInkAnnotation"></a>
# **getInkAnnotation**
> InkAnnotationResponse getInkAnnotation(name, annotationId, storage, folder)

Read document page ink annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**InkAnnotationResponse**](InkAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLineAnnotation"></a>
# **getLineAnnotation**
> LineAnnotationResponse getLineAnnotation(name, annotationId, storage, folder)

Read document page line annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**LineAnnotationResponse**](LineAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLinkAnnotation"></a>
# **getLinkAnnotation**
> LinkAnnotationResponse getLinkAnnotation(name, linkId, storage, folder)

Read document link annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **linkId** | **String**| The link ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**LinkAnnotationResponse**](LinkAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getListBoxField"></a>
# **getListBoxField**
> ListBoxFieldResponse getListBoxField(name, fieldName, storage, folder)

Read document listbox field by name.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ListBoxFieldResponse**](ListBoxFieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMarkdownInStorageToPdf"></a>
# **getMarkdownInStorageToPdf**
> File getMarkdownInStorageToPdf(srcPath, storage)

Convert MD file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.md) |
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getMhtInStorageToPdf"></a>
# **getMhtInStorageToPdf**
> File getMhtInStorageToPdf(srcPath, height, width, marginLeft, marginBottom, marginRight, marginTop, storage)

Convert MHT file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.mht) |
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getMovieAnnotation"></a>
# **getMovieAnnotation**
> MovieAnnotationResponse getMovieAnnotation(name, annotationId, storage, folder)

Read document page movie annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**MovieAnnotationResponse**](MovieAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPage"></a>
# **getPage**
> DocumentPageResponse getPage(name, pageNumber, storage, folder)

Read document page info.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**DocumentPageResponse**](DocumentPageResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageAnnotations"></a>
# **getPageAnnotations**
> AnnotationsInfoResponse getPageAnnotations(name, pageNumber, storage, folder)

Read document page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AnnotationsInfoResponse**](AnnotationsInfoResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageCaretAnnotations"></a>
# **getPageCaretAnnotations**
> CaretAnnotationsResponse getPageCaretAnnotations(name, pageNumber, storage, folder)

Read document page caret annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CaretAnnotationsResponse**](CaretAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageCheckBoxFields"></a>
# **getPageCheckBoxFields**
> CheckBoxFieldsResponse getPageCheckBoxFields(name, pageNumber, storage, folder)

Read document page checkbox fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CheckBoxFieldsResponse**](CheckBoxFieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageCircleAnnotations"></a>
# **getPageCircleAnnotations**
> CircleAnnotationsResponse getPageCircleAnnotations(name, pageNumber, storage, folder)

Read document page circle annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CircleAnnotationsResponse**](CircleAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageComboBoxFields"></a>
# **getPageComboBoxFields**
> ComboBoxFieldsResponse getPageComboBoxFields(name, pageNumber, storage, folder)

Read document page combobox fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ComboBoxFieldsResponse**](ComboBoxFieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageConvertToBmp"></a>
# **getPageConvertToBmp**
> File getPageConvertToBmp(name, pageNumber, width, height, folder, storage, password)

Convert document page to Bmp image and return resulting file in response.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPageConvertToEmf"></a>
# **getPageConvertToEmf**
> File getPageConvertToEmf(name, pageNumber, width, height, folder, storage, password)

Convert document page to Emf image and return resulting file in response.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPageConvertToGif"></a>
# **getPageConvertToGif**
> File getPageConvertToGif(name, pageNumber, width, height, folder, storage, password)

Convert document page to Gif image and return resulting file in response.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPageConvertToJpeg"></a>
# **getPageConvertToJpeg**
> File getPageConvertToJpeg(name, pageNumber, width, height, folder, storage, password)

Convert document page to Jpeg image and return resulting file in response.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPageConvertToPng"></a>
# **getPageConvertToPng**
> File getPageConvertToPng(name, pageNumber, width, height, folder, storage, password)

Convert document page to Png image and return resulting file in response.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPageConvertToTiff"></a>
# **getPageConvertToTiff**
> File getPageConvertToTiff(name, pageNumber, width, height, folder, storage, password)

Convert document page to Tiff image  and return resulting file in response.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPageFileAttachmentAnnotations"></a>
# **getPageFileAttachmentAnnotations**
> FileAttachmentAnnotationsResponse getPageFileAttachmentAnnotations(name, pageNumber, storage, folder)

Read document page FileAttachment annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FileAttachmentAnnotationsResponse**](FileAttachmentAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageFreeTextAnnotations"></a>
# **getPageFreeTextAnnotations**
> FreeTextAnnotationsResponse getPageFreeTextAnnotations(name, pageNumber, storage, folder)

Read document page free text annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FreeTextAnnotationsResponse**](FreeTextAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageHighlightAnnotations"></a>
# **getPageHighlightAnnotations**
> HighlightAnnotationsResponse getPageHighlightAnnotations(name, pageNumber, storage, folder)

Read document page highlight annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**HighlightAnnotationsResponse**](HighlightAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageInkAnnotations"></a>
# **getPageInkAnnotations**
> InkAnnotationsResponse getPageInkAnnotations(name, pageNumber, storage, folder)

Read document page ink annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**InkAnnotationsResponse**](InkAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageLineAnnotations"></a>
# **getPageLineAnnotations**
> LineAnnotationsResponse getPageLineAnnotations(name, pageNumber, storage, folder)

Read document page line annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**LineAnnotationsResponse**](LineAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageLinkAnnotation"></a>
# **getPageLinkAnnotation**
> LinkAnnotationResponse getPageLinkAnnotation(name, pageNumber, linkId, storage, folder)

Read document page link annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **linkId** | **String**| The link ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**LinkAnnotationResponse**](LinkAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageLinkAnnotations"></a>
# **getPageLinkAnnotations**
> LinkAnnotationsResponse getPageLinkAnnotations(name, pageNumber, storage, folder)

Read document page link annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**LinkAnnotationsResponse**](LinkAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageListBoxFields"></a>
# **getPageListBoxFields**
> ListBoxFieldsResponse getPageListBoxFields(name, pageNumber, storage, folder)

Read document page listbox fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ListBoxFieldsResponse**](ListBoxFieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageMovieAnnotations"></a>
# **getPageMovieAnnotations**
> MovieAnnotationsResponse getPageMovieAnnotations(name, pageNumber, storage, folder)

Read document page movie annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**MovieAnnotationsResponse**](MovieAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPagePolyLineAnnotations"></a>
# **getPagePolyLineAnnotations**
> PolyLineAnnotationsResponse getPagePolyLineAnnotations(name, pageNumber, storage, folder)

Read document page polyline annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PolyLineAnnotationsResponse**](PolyLineAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPagePolygonAnnotations"></a>
# **getPagePolygonAnnotations**
> PolygonAnnotationsResponse getPagePolygonAnnotations(name, pageNumber, storage, folder)

Read document page polygon annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PolygonAnnotationsResponse**](PolygonAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPagePopupAnnotations"></a>
# **getPagePopupAnnotations**
> PopupAnnotationsResponse getPagePopupAnnotations(name, pageNumber, storage, folder)

Read document page popup annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PopupAnnotationsResponse**](PopupAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageRadioButtonFields"></a>
# **getPageRadioButtonFields**
> RadioButtonFieldsResponse getPageRadioButtonFields(name, pageNumber, storage, folder)

Read document page radiobutton fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**RadioButtonFieldsResponse**](RadioButtonFieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageRedactionAnnotations"></a>
# **getPageRedactionAnnotations**
> RedactionAnnotationsResponse getPageRedactionAnnotations(name, pageNumber, storage, folder)

Read document page redaction annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**RedactionAnnotationsResponse**](RedactionAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageScreenAnnotations"></a>
# **getPageScreenAnnotations**
> ScreenAnnotationsResponse getPageScreenAnnotations(name, pageNumber, storage, folder)

Read document page screen annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ScreenAnnotationsResponse**](ScreenAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageSignatureFields"></a>
# **getPageSignatureFields**
> SignatureFieldsResponse getPageSignatureFields(name, pageNumber, storage, folder)

Read document page signature fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SignatureFieldsResponse**](SignatureFieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageSoundAnnotations"></a>
# **getPageSoundAnnotations**
> SoundAnnotationsResponse getPageSoundAnnotations(name, pageNumber, storage, folder)

Read document page sound annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SoundAnnotationsResponse**](SoundAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageSquareAnnotations"></a>
# **getPageSquareAnnotations**
> SquareAnnotationsResponse getPageSquareAnnotations(name, pageNumber, storage, folder)

Read document page square annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SquareAnnotationsResponse**](SquareAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageSquigglyAnnotations"></a>
# **getPageSquigglyAnnotations**
> SquigglyAnnotationsResponse getPageSquigglyAnnotations(name, pageNumber, storage, folder)

Read document page squiggly annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SquigglyAnnotationsResponse**](SquigglyAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageStampAnnotations"></a>
# **getPageStampAnnotations**
> StampAnnotationsResponse getPageStampAnnotations(name, pageNumber, storage, folder)

Read document page stamp annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**StampAnnotationsResponse**](StampAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageStamps"></a>
# **getPageStamps**
> StampsInfoResponse getPageStamps(name, pageNumber, storage, folder, password)

Read page document stamps.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**StampsInfoResponse**](StampsInfoResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageStrikeOutAnnotations"></a>
# **getPageStrikeOutAnnotations**
> StrikeOutAnnotationsResponse getPageStrikeOutAnnotations(name, pageNumber, storage, folder)

Read document page StrikeOut annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**StrikeOutAnnotationsResponse**](StrikeOutAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageTables"></a>
# **getPageTables**
> TablesRecognizedResponse getPageTables(name, pageNumber, storage, folder)

Read document page tables.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **pageNumber** | **Integer**|  |
 **storage** | **String**|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**TablesRecognizedResponse**](TablesRecognizedResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageText"></a>
# **getPageText**
> TextRectsResponse getPageText(name, pageNumber, LLX, LLY, URX, URY, format, regex, splitRects, folder, storage)

Read page text items.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| Number of page (starting from 1). |
 **LLX** | **Double**| X-coordinate of lower - left corner. |
 **LLY** | **Double**| Y - coordinate of lower-left corner. |
 **URX** | **Double**| X - coordinate of upper-right corner. |
 **URY** | **Double**| Y - coordinate of upper-right corner. |
 **format** | **List&lt;String&gt;**| List of formats for search. | [optional]
 **regex** | **String**| Formats are specified as a regular expression. | [optional]
 **splitRects** | **Boolean**| Split result fragments (default is true). | [optional] [default to true]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**TextRectsResponse**](TextRectsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageTextAnnotations"></a>
# **getPageTextAnnotations**
> TextAnnotationsResponse getPageTextAnnotations(name, pageNumber, storage, folder)

Read document page text annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TextAnnotationsResponse**](TextAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageTextBoxFields"></a>
# **getPageTextBoxFields**
> TextBoxFieldsResponse getPageTextBoxFields(name, pageNumber, storage, folder)

Read document page text box fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TextBoxFieldsResponse**](TextBoxFieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageUnderlineAnnotations"></a>
# **getPageUnderlineAnnotations**
> UnderlineAnnotationsResponse getPageUnderlineAnnotations(name, pageNumber, storage, folder)

Read document page underline annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**UnderlineAnnotationsResponse**](UnderlineAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPages"></a>
# **getPages**
> DocumentPagesResponse getPages(name, storage, folder)

Read document pages info.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**DocumentPagesResponse**](DocumentPagesResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPclInStorageToPdf"></a>
# **getPclInStorageToPdf**
> File getPclInStorageToPdf(srcPath, storage)

Convert PCL file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.pcl) |
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfAInStorageToPdf"></a>
# **getPdfAInStorageToPdf**
> File getPdfAInStorageToPdf(srcPath, dontOptimize, storage)

Convert PDFA file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.pdf) |
 **dontOptimize** | **Boolean**| If set, document resources will not be optimized. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToAps"></a>
# **getPdfInStorageToAps**
> File getPdfInStorageToAps(name, folder, storage)

Converts PDF document (located on storage) to APS format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToDoc"></a>
# **getPdfInStorageToDoc**
> File getPdfInStorageToDoc(name, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder, storage, password)

Converts PDF document (located on storage) to DOC format and returns resulting file in response content.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **addReturnToLineEnd** | **Boolean**| Add return to line end. | [optional]
 **format** | **String**| Allows to specify .doc or .docx file format. | [optional] [enum: Doc, DocX]
 **imageResolutionX** | **Integer**| Image resolution X. | [optional]
 **imageResolutionY** | **Integer**| Image resolution Y. | [optional]
 **maxDistanceBetweenTextLines** | **Double**| Max distance between text lines. | [optional]
 **mode** | **String**| Allows to control how a PDF document is converted into a word processing document. | [optional] [enum: Textbox, Flow, EnhancedFlow]
 **recognizeBullets** | **Boolean**| Recognize bullets. | [optional]
 **relativeHorizontalProximity** | **Double**| Relative horizontal proximity. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToEpub"></a>
# **getPdfInStorageToEpub**
> File getPdfInStorageToEpub(name, contentRecognitionMode, folder, storage)

Converts PDF document (located on storage) to EPUB format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **contentRecognitionMode** | **String**| Property tunes conversion for this or that desirable method of recognition of content. | [optional] [enum: Flow, PdfFlow, Fixed]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToHtml"></a>
# **getPdfInStorageToHtml**
> File getPdfInStorageToHtml(name, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder, storage, flowLayoutParagraphFullWidth)

Converts PDF document (located on storage) to Html format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **additionalMarginWidthInPoints** | **Integer**| Defines width of margin that will be forcibly left around that output HTML-areas. | [optional]
 **compressSvgGraphicsIfAny** | **Boolean**| The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. | [optional]
 **convertMarkedContentToLayers** | **Boolean**| If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with &quot;data-pdflayer&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. | [optional]
 **defaultFontName** | **String**| Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. | [optional]
 **documentType** | **String**| Result document type. | [optional] [enum: Xhtml, Html5]
 **fixedLayout** | **Boolean**| The value indicating whether that HTML is created as fixed layout. | [optional]
 **imageResolution** | **Integer**| Resolution for image rendering. | [optional]
 **minimalLineWidth** | **Integer**| This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. | [optional]
 **preventGlyphsGrouping** | **Boolean**| This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. | [optional]
 **splitCssIntoPages** | **Boolean**| When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. | [optional]
 **splitIntoPages** | **Boolean**| The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. | [optional]
 **useZOrder** | **Boolean**| If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. | [optional]
 **antialiasingProcessing** | **String**| The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. | [optional] [enum: NoAdditionalProcessing, TryCorrectResultHtml]
 **cssClassNamesPrefix** | **String**| When PDFtoHTML converter generates result CSSs, CSS class names (something like &quot;.stl_01 {}&quot; ... &quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. | [optional]
 **explicitListOfSavedPages** | **List&lt;Integer&gt;**| With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. | [optional]
 **fontEncodingStrategy** | **String**| Defines encoding special rule to tune PDF decoding for current document. | [optional] [enum: Default, DecreaseToUnicodePriorityLevel]
 **fontSavingMode** | **String**| Defines font saving mode that will be used during saving of PDF to desirable format. | [optional] [enum: AlwaysSaveAsWOFF, AlwaysSaveAsTTF, AlwaysSaveAsEOT, SaveInAllFormats]
 **htmlMarkupGenerationMode** | **String**| Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. | [optional] [enum: WriteAllHtml, WriteOnlyBodyContent]
 **lettersPositioningMethod** | **String**| The mode of positioning of letters in words in result HTML. | [optional] [enum: UseEmUnitsAndCompensationOfRoundingErrorsInCss, UsePixelUnitsInCssLetterSpacingForIE]
 **pagesFlowTypeDependsOnViewersScreenSize** | **Boolean**| If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. | [optional]
 **partsEmbeddingMode** | **String**| It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. | [optional] [enum: EmbedAllIntoHtml, EmbedCssOnly, NoEmbedding]
 **rasterImagesSavingMode** | **String**| Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. | [optional] [enum: AsPngImagesEmbeddedIntoSvg, AsExternalPngFilesReferencedViaSvg, AsEmbeddedPartsOfPngPageBackground]
 **removeEmptyAreasOnTopAndBottom** | **Boolean**| Defines whether in created HTML will be removed top and bottom empty area without any content (if any). | [optional]
 **saveShadowedTextsAsTransparentTexts** | **Boolean**| Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). | [optional]
 **saveTransparentTexts** | **Boolean**| Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. | [optional]
 **specialFolderForAllImages** | **String**| The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. | [optional]
 **specialFolderForSvgImages** | **String**| The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. | [optional]
 **trySaveTextUnderliningAndStrikeoutingInCss** | **Boolean**| PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **flowLayoutParagraphFullWidth** | **Boolean**| This attribute specifies full width paragraph text for Flow mode, FixedLayout &#x3D; false. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToMobiXml"></a>
# **getPdfInStorageToMobiXml**
> File getPdfInStorageToMobiXml(name, folder, storage)

Converts PDF document (located on storage) to MOBIXML format and returns resulting ZIP archive file in response content.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToPdfA"></a>
# **getPdfInStorageToPdfA**
> File getPdfInStorageToPdfA(name, type, folder, storage, password)

Converts PDF document (located on storage) to PdfA format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **type** | **String**| Type of PdfA format. | [enum: PDFA1A, PDFA1B, PDFA3A, PDFA3B]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToPptx"></a>
# **getPdfInStorageToPptx**
> File getPdfInStorageToPptx(name, separateImages, slidesAsImages, folder, storage, password)

Converts PDF document (located on storage) to PPTX format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **separateImages** | **Boolean**| Separate images. | [optional]
 **slidesAsImages** | **Boolean**| Slides as images. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToSvg"></a>
# **getPdfInStorageToSvg**
> File getPdfInStorageToSvg(name, compressOutputToZipArchive, folder, storage, password)

Converts PDF document (located on storage) to SVG format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **compressOutputToZipArchive** | **Boolean**| Specifies whether output will be created as one zip-archive. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToTeX"></a>
# **getPdfInStorageToTeX**
> File getPdfInStorageToTeX(name, folder, storage)

Converts PDF document (located on storage) to TeX format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToText"></a>
# **getPdfInStorageToText**
> File getPdfInStorageToText(name, folder, storage)

Converts PDF document (located on storage) to Text format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToTiff"></a>
# **getPdfInStorageToTiff**
> File getPdfInStorageToTiff(name, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder, storage)

Converts PDF document (located on storage) to TIFF format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **brightness** | **Double**| Image brightness. | [optional]
 **compression** | **String**| Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. | [optional] [enum: LZW, CCITT4, CCITT3, RLE, None]
 **colorDepth** | **String**| Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. | [optional] [enum: Default, Format8bpp, Format4bpp, Format1bpp]
 **leftMargin** | **Integer**| Left image margin. | [optional]
 **rightMargin** | **Integer**| Right image margin. | [optional]
 **topMargin** | **Integer**| Top image margin. | [optional]
 **bottomMargin** | **Integer**| Bottom image margin. | [optional]
 **orientation** | **String**| Image orientation. Possible values are: None, Landscape, Portait. | [optional] [enum: None, Landscape, Portrait]
 **skipBlankPages** | **Boolean**| Skip blank pages flag. | [optional]
 **width** | **Integer**| Image width. | [optional]
 **height** | **Integer**| Image height. | [optional]
 **xResolution** | **Integer**| Horizontal resolution. | [optional]
 **yResolution** | **Integer**| Vertical resolution. | [optional]
 **pageIndex** | **Integer**| Start page to export. | [optional]
 **pageCount** | **Integer**| Number of pages to export. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToXls"></a>
# **getPdfInStorageToXls**
> File getPdfInStorageToXls(name, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, storage, password)

Converts PDF document (located on storage) to XLS format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **insertBlankColumnAtFirst** | **Boolean**| Insert blank column at first | [optional]
 **minimizeTheNumberOfWorksheets** | **Boolean**| Minimize the number of worksheets | [optional]
 **scaleFactor** | **Double**| Scale factor (Obsolete) | [optional]
 **uniformWorksheets** | **Boolean**| Uniform worksheets | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToXlsx"></a>
# **getPdfInStorageToXlsx**
> File getPdfInStorageToXlsx(name, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, storage, password)

Converts PDF document (located on storage) to XLSX format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **insertBlankColumnAtFirst** | **Boolean**| Insert blank column at first | [optional]
 **minimizeTheNumberOfWorksheets** | **Boolean**| Minimize the number of worksheets | [optional]
 **scaleFactor** | **Double**| Scale factor (Obsolete) | [optional]
 **uniformWorksheets** | **Boolean**| Uniform worksheets | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToXml"></a>
# **getPdfInStorageToXml**
> File getPdfInStorageToXml(name, folder, storage)

Converts PDF document (located on storage) to XML format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToXps"></a>
# **getPdfInStorageToXps**
> File getPdfInStorageToXps(name, folder, storage)

Converts PDF document (located on storage) to XPS format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPolyLineAnnotation"></a>
# **getPolyLineAnnotation**
> PolyLineAnnotationResponse getPolyLineAnnotation(name, annotationId, storage, folder)

Read document page polyline annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PolyLineAnnotationResponse**](PolyLineAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPolygonAnnotation"></a>
# **getPolygonAnnotation**
> PolygonAnnotationResponse getPolygonAnnotation(name, annotationId, storage, folder)

Read document page polygon annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PolygonAnnotationResponse**](PolygonAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPopupAnnotation"></a>
# **getPopupAnnotation**
> PopupAnnotationResponse getPopupAnnotation(name, annotationId, storage, folder)

Read document page popup annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PopupAnnotationResponse**](PopupAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPsInStorageToPdf"></a>
# **getPsInStorageToPdf**
> File getPsInStorageToPdf(srcPath, storage)

Convert PS file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.ps) |
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getRadioButtonField"></a>
# **getRadioButtonField**
> RadioButtonFieldResponse getRadioButtonField(name, fieldName, storage, folder)

Read document RadioButton field by name.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**RadioButtonFieldResponse**](RadioButtonFieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRedactionAnnotation"></a>
# **getRedactionAnnotation**
> RedactionAnnotationResponse getRedactionAnnotation(name, annotationId, storage, folder)

Read document page redaction annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**RedactionAnnotationResponse**](RedactionAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getScreenAnnotation"></a>
# **getScreenAnnotation**
> ScreenAnnotationResponse getScreenAnnotation(name, annotationId, storage, folder)

Read document page screen annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ScreenAnnotationResponse**](ScreenAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getScreenAnnotationData"></a>
# **getScreenAnnotationData**
> File getScreenAnnotationData(name, annotationId, storage, folder)

Read document page screen annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getSignatureField"></a>
# **getSignatureField**
> SignatureFieldResponse getSignatureField(name, fieldName, storage, folder)

Read document signature field by name.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SignatureFieldResponse**](SignatureFieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSoundAnnotation"></a>
# **getSoundAnnotation**
> SoundAnnotationResponse getSoundAnnotation(name, annotationId, storage, folder)

Read document page sound annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SoundAnnotationResponse**](SoundAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSoundAnnotationData"></a>
# **getSoundAnnotationData**
> File getSoundAnnotationData(name, annotationId, storage, folder)

Read document page sound annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getSquareAnnotation"></a>
# **getSquareAnnotation**
> SquareAnnotationResponse getSquareAnnotation(name, annotationId, storage, folder)

Read document page square annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SquareAnnotationResponse**](SquareAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSquigglyAnnotation"></a>
# **getSquigglyAnnotation**
> SquigglyAnnotationResponse getSquigglyAnnotation(name, annotationId, storage, folder)

Read document page squiggly annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SquigglyAnnotationResponse**](SquigglyAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStampAnnotation"></a>
# **getStampAnnotation**
> StampAnnotationResponse getStampAnnotation(name, annotationId, storage, folder)

Read document page stamp annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**StampAnnotationResponse**](StampAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStampAnnotationData"></a>
# **getStampAnnotationData**
> File getStampAnnotationData(name, annotationId, storage, folder)

Read document page stamp annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStrikeOutAnnotation"></a>
# **getStrikeOutAnnotation**
> StrikeOutAnnotationResponse getStrikeOutAnnotation(name, annotationId, storage, folder)

Read document page StrikeOut annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**StrikeOutAnnotationResponse**](StrikeOutAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSvgInStorageToPdf"></a>
# **getSvgInStorageToPdf**
> File getSvgInStorageToPdf(srcPath, adjustPageSize, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, storage)

Convert SVG file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.svg) |
 **adjustPageSize** | **Boolean**| Adjust page size | [optional]
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getTable"></a>
# **getTable**
> TableRecognizedResponse getTable(name, tableId, storage, folder)

Read document page table by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tableId** | **String**| The table ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TableRecognizedResponse**](TableRecognizedResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTeXInStorageToPdf"></a>
# **getTeXInStorageToPdf**
> File getTeXInStorageToPdf(srcPath, storage)

Convert TeX file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.tex) |
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getText"></a>
# **getText**
> TextRectsResponse getText(name, LLX, LLY, URX, URY, format, regex, splitRects, folder, storage)

Read document text.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **LLX** | **Double**| X-coordinate of lower - left corner. |
 **LLY** | **Double**| Y - coordinate of lower-left corner. |
 **URX** | **Double**| X - coordinate of upper-right corner. |
 **URY** | **Double**| Y - coordinate of upper-right corner. |
 **format** | **List&lt;String&gt;**| List of formats for search. | [optional]
 **regex** | **String**| Formats are specified as a regular expression. | [optional]
 **splitRects** | **Boolean**| Split result fragments (default is true). | [optional] [default to true]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**TextRectsResponse**](TextRectsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTextAnnotation"></a>
# **getTextAnnotation**
> TextAnnotationResponse getTextAnnotation(name, annotationId, storage, folder)

Read document page text annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TextAnnotationResponse**](TextAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTextBoxField"></a>
# **getTextBoxField**
> TextBoxFieldResponse getTextBoxField(name, fieldName, storage, folder)

Read document text box field by name.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TextBoxFieldResponse**](TextBoxFieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUnderlineAnnotation"></a>
# **getUnderlineAnnotation**
> UnderlineAnnotationResponse getUnderlineAnnotation(name, annotationId, storage, folder)

Read document page underline annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**UnderlineAnnotationResponse**](UnderlineAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVerifySignature"></a>
# **getVerifySignature**
> SignatureVerifyResponse getVerifySignature(name, signName, storage, folder)

Verify signature document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **signName** | **String**| Sign name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SignatureVerifyResponse**](SignatureVerifyResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWebInStorageToPdf"></a>
# **getWebInStorageToPdf**
> File getWebInStorageToPdf(url, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, storage)

Convert web page to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**| Source url |
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getWordsPerPage"></a>
# **getWordsPerPage**
> WordCountResponse getWordsPerPage(name, storage, folder)

Get number of words per document page.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**WordCountResponse**](WordCountResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getXfaPdfInStorageToAcroForm"></a>
# **getXfaPdfInStorageToAcroForm**
> File getXfaPdfInStorageToAcroForm(name, folder, storage)

Converts PDF document which contains XFA form (located on storage) to PDF with AcroForm and returns resulting file response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getXmlInStorageToPdf"></a>
# **getXmlInStorageToPdf**
> File getXmlInStorageToPdf(srcPath, xslFilePath, storage)

Convert XML file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xml) |
 **xslFilePath** | **String**| Full XSL source filename (ex. /folder1/folder2/template.xsl) | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getXmpMetadataJson"></a>
# **getXmpMetadataJson**
> XmpMetadata getXmpMetadataJson(name, folder, storage, passBase64)

Gets document XMP Metadata as JSON.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **passBase64** | **String**| The password (Base64). | [optional]

### Return type

[**XmpMetadata**](XmpMetadata.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getXmpMetadataXml"></a>
# **getXmpMetadataXml**
> File getXmpMetadataXml(name, folder, storage, passBase64)

Gets document XMP Metadata as XML file.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **passBase64** | **String**| The password (Base64). | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getXpsInStorageToPdf"></a>
# **getXpsInStorageToPdf**
> File getXpsInStorageToPdf(srcPath, storage)

Convert XPS file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xps) |
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getXslFoInStorageToPdf"></a>
# **getXslFoInStorageToPdf**
> File getXslFoInStorageToPdf(srcPath, storage)

Convert XslFo file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xslfo) |
 **storage** | **String**| The document storage. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="moveFile"></a>
# **moveFile**
> moveFile(srcPath, destPath, srcStorageName, destStorageName, versionId)

Move file

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
 **destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to move | [optional]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveFolder"></a>
# **moveFolder**
> moveFolder(srcPath, destPath, srcStorageName, destStorageName)

Move folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
 **destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="objectExists"></a>
# **objectExists**
> ObjectExist objectExists(path, storageName, versionId)

Check if file or folder exists

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID | [optional]

### Return type

[**ObjectExist**](ObjectExist.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAddDocumentAttachment"></a>
# **postAddDocumentAttachment**
> AttachmentsResponse postAddDocumentAttachment(name, attachmentInfo, storage, folder)

Adds a file attachment to the PDF document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **attachmentInfo** | [**AttachmentInfo**](AttachmentInfo.md)| AttachmentInfoAttachmentInfo instance. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AttachmentsResponse**](AttachmentsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAppendDocument"></a>
# **postAppendDocument**
> DocumentResponse postAppendDocument(name, appendFile, startPage, endPage, storage, folder)

Append document to existing one.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The original document name. |
 **appendFile** | **String**| Append file server path. |
 **startPage** | **Integer**| Appending start page. | [optional] [default to 0]
 **endPage** | **Integer**| Appending end page. | [optional] [default to 0]
 **storage** | **String**| The documents storage. | [optional]
 **folder** | **String**| The original document folder. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBookmark"></a>
# **postBookmark**
> BookmarksResponse postBookmark(name, bookmarkPath, bookmarks, folder, storage, password)

Add document bookmarks.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **bookmarkPath** | **String**| The parent bookmark path. Specify an empty string when adding a bookmark to the root. |
 **bookmarks** | [**List&lt;Bookmark&gt;**](Bookmark.md)| The array of bookmark. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**BookmarksResponse**](BookmarksResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postChangePasswordDocumentInStorage"></a>
# **postChangePasswordDocumentInStorage**
> AsposeResponse postChangePasswordDocumentInStorage(name, ownerPassword, newUserPassword, newOwnerPassword, storage, folder)

Change document password in storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **ownerPassword** | **String**| Owner password (encrypted Base64). |
 **newUserPassword** | **String**| New user password (encrypted Base64). |
 **newOwnerPassword** | **String**| New owner password (encrypted Base64). |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCheckBoxFields"></a>
# **postCheckBoxFields**
> AsposeResponse postCheckBoxFields(name, fields, storage, folder)

Add document checkbox fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fields** | [**List&lt;CheckBoxField&gt;**](CheckBoxField.md)| The array of field. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postComboBoxFields"></a>
# **postComboBoxFields**
> AsposeResponse postComboBoxFields(name, fields, storage, folder)

Add document combobox fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fields** | [**List&lt;ComboBoxField&gt;**](ComboBoxField.md)| The array of field. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postComparePdf"></a>
# **postComparePdf**
> AsposeResponse postComparePdf(path1, path2, outPath, storage)

Compare two PDF documents.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path1** | **String**| Path to first PDF document. |
 **path2** | **String**| Path to second PDF document. |
 **outPath** | **String**| Full filename of the resulting document. |
 **storage** | **String**| The documents storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCreateDocument"></a>
# **postCreateDocument**
> DocumentResponse postCreateDocument(name, documentConfig, storage, folder)

Create empty document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The new document name. |
 **documentConfig** | [**DocumentConfig**](DocumentConfig.md)| The document config for new document. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The new document folder. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCreateField"></a>
# **postCreateField**
> AsposeResponse postCreateField(name, page, field, storage, folder)

Create field.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **page** | **Integer**| Document page number. |
 **field** | [**Field**](Field.md)| Field with the field data. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDecryptDocumentInStorage"></a>
# **postDecryptDocumentInStorage**
> AsposeResponse postDecryptDocumentInStorage(name, password, storage, folder)

Decrypt document in storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **password** | **String**| The password (encrypted Base64). |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentImageFooter"></a>
# **postDocumentImageFooter**
> AsposeResponse postDocumentImageFooter(name, imageFooter, startPageNumber, endPageNumber, storage, folder)

Add document image footer.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageFooter** | [**ImageFooter**](ImageFooter.md)| The image footer. |
 **startPageNumber** | **Integer**| The start page number. | [optional]
 **endPageNumber** | **Integer**| The end page number. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentImageHeader"></a>
# **postDocumentImageHeader**
> AsposeResponse postDocumentImageHeader(name, imageHeader, startPageNumber, endPageNumber, storage, folder)

Add document image header.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageHeader** | [**ImageHeader**](ImageHeader.md)| The image header. |
 **startPageNumber** | **Integer**| The start page number. | [optional]
 **endPageNumber** | **Integer**| The end page number. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentImageStamps"></a>
# **postDocumentImageStamps**
> AsposeResponse postDocumentImageStamps(name, stamps, storage, folder, password)

Add document pages image stamps.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **stamps** | [**List&lt;ImageStamp&gt;**](ImageStamp.md)| The array of stamp. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentImageStampsPageSpecified"></a>
# **postDocumentImageStampsPageSpecified**
> AsposeResponse postDocumentImageStampsPageSpecified(name, stamps, storage, folder, password)

Add document image stamps to specified pages.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **stamps** | [**List&lt;ImageStampPageSpecified&gt;**](ImageStampPageSpecified.md)| The array of stamps. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentPageNumberStamps"></a>
# **postDocumentPageNumberStamps**
> AsposeResponse postDocumentPageNumberStamps(name, stamp, startPageNumber, endPageNumber, storage, folder, password)

Add document page number stamps.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **stamp** | [**PageNumberStamp**](PageNumberStamp.md)| The stamp. |
 **startPageNumber** | **Integer**| The start page number. | [optional]
 **endPageNumber** | **Integer**| The end page number. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentPagesCrop"></a>
# **postDocumentPagesCrop**
> AsposeResponse postDocumentPagesCrop(name, pages, rect, storage, folder, password)

Crop PDF document pages.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pages** | **String**| Comma separated list of pages and page ranges. (Example: 1,3-5,8) |
 **rect** | [**Rectangle**](Rectangle.md)| Rectangle of document area. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentPagesResize"></a>
# **postDocumentPagesResize**
> AsposeResponse postDocumentPagesResize(name, height, width, pages, storage, folder, password)

Rsize PDF document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **height** | **Double**| Page Height |
 **width** | **Double**| Page width |
 **pages** | **String**| Comma separated list of pages and page ranges. (Example: 1,3-5,8) |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentPagesRotate"></a>
# **postDocumentPagesRotate**
> AsposeResponse postDocumentPagesRotate(name, rotationAngle, pages, storage, folder, password)

Rotate PDF document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **rotationAngle** | **String**| Rotation Angle (CKW). Can be 90, 180, 270. | [enum: None, on90, on180, on270]
 **pages** | **String**| Comma separated list of pages and page ranges. (Example: 1,3-5,8) |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentTextFooter"></a>
# **postDocumentTextFooter**
> AsposeResponse postDocumentTextFooter(name, textFooter, startPageNumber, endPageNumber, storage, folder)

Add document text footer.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **textFooter** | [**TextFooter**](TextFooter.md)| The text footer. |
 **startPageNumber** | **Integer**| The start page number. | [optional]
 **endPageNumber** | **Integer**| The end page number. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentTextHeader"></a>
# **postDocumentTextHeader**
> AsposeResponse postDocumentTextHeader(name, textHeader, startPageNumber, endPageNumber, storage, folder)

Add document text header.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **textHeader** | [**TextHeader**](TextHeader.md)| The text header. |
 **startPageNumber** | **Integer**| The start page number. | [optional]
 **endPageNumber** | **Integer**| The end page number. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentTextReplace"></a>
# **postDocumentTextReplace**
> TextReplaceResponse postDocumentTextReplace(name, textReplace, storage, folder)

Document&#39;s replace text method.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **textReplace** | [**TextReplaceListRequest**](TextReplaceListRequest.md)|  |
 **storage** | **String**|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**TextReplaceResponse**](TextReplaceResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentTextStamps"></a>
# **postDocumentTextStamps**
> AsposeResponse postDocumentTextStamps(name, stamps, storage, folder, password)

Add document pages text stamps.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **stamps** | [**List&lt;TextStamp&gt;**](TextStamp.md)| The array of stamp. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentTextStampsPageSpecified"></a>
# **postDocumentTextStampsPageSpecified**
> AsposeResponse postDocumentTextStampsPageSpecified(name, stamps, storage, folder, password)

Add document text stamps to specified pages.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **stamps** | [**List&lt;TextStampPageSpecified&gt;**](TextStampPageSpecified.md)| The array of stamps. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postEncryptDocumentInStorage"></a>
# **postEncryptDocumentInStorage**
> AsposeResponse postEncryptDocumentInStorage(name, userPassword, ownerPassword, cryptoAlgorithm, permissionsFlags, usePdf20, storage, folder)

Encrypt document in storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **userPassword** | **String**| User password (encrypted Base64). |
 **ownerPassword** | **String**| Owner password (encrypted Base64). |
 **cryptoAlgorithm** | **String**| Cryptographic algorithm, see CryptoAlgorithm for details. | [enum: RC4x40, RC4x128, AESx128, AESx256]
 **permissionsFlags** | [**List&lt;PermissionsFlags&gt;**](PermissionsFlags.md)| Array of document permissions, see PermissionsFlags for details. | [optional]
 **usePdf20** | **Boolean**| Support for revision 6 (Extension 8). | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFlattenDocument"></a>
# **postFlattenDocument**
> AsposeResponse postFlattenDocument(name, updateAppearances, callEvents, hideButtons, storage, folder)

Flatten the document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **updateAppearances** | **Boolean**| If set, all field appearances will be regenerated before flattening. This option may help if field is incorrectly flattened. This option may decrease performance.. | [optional]
 **callEvents** | **Boolean**| If set, formatting and other JavaScript events will be called. | [optional]
 **hideButtons** | **Boolean**| If set, buttons will be removed from flattened document. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postHtmlToPdf"></a>
# **postHtmlToPdf**
> File postHtmlToPdf(htmlFileName, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop)

Convert HTML file (zip archive in request content) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **htmlFileName** | **String**| Name of HTML file in ZIP. | [optional]
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: multipart/form-data

<a name="postImportFieldsFromFdf"></a>
# **postImportFieldsFromFdf**
> AsposeResponse postImportFieldsFromFdf(name, storage, folder, fdfData)

Update fields from FDF file in request.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **fdfData** | [****](.md)| Fdf file. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="postImportFieldsFromXfdf"></a>
# **postImportFieldsFromXfdf**
> AsposeResponse postImportFieldsFromXfdf(name, storage, folder, xfdfData)

Update fields from XFDF file in request.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **xfdfData** | [****](.md)| Xfdf file. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="postImportFieldsFromXml"></a>
# **postImportFieldsFromXml**
> AsposeResponse postImportFieldsFromXml(name, storage, folder, xmlData)

Update fields from XML file in request.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **xmlData** | [****](.md)| Xml file. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="postInsertImage"></a>
# **postInsertImage**
> AsposeResponse postInsertImage(name, pageNumber, llx, lly, urx, ury, imageFilePath, storage, folder, image)

Insert image to document page.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **llx** | **Double**| Coordinate lower left X. |
 **lly** | **Double**| Coordinate lower left Y. |
 **urx** | **Double**| Coordinate upper right X. |
 **ury** | **Double**| Coordinate upper right Y. |
 **imageFilePath** | **String**| Path to image file if specified. Request content is used otherwise. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **image** | [****](.md)| Image file. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="postListBoxFields"></a>
# **postListBoxFields**
> AsposeResponse postListBoxFields(name, fields, storage, folder)

Add document listbox fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fields** | [**List&lt;ListBoxField&gt;**](ListBoxField.md)| The array of field. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postMovePage"></a>
# **postMovePage**
> AsposeResponse postMovePage(name, pageNumber, newIndex, storage, folder)

Move page to new position.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **newIndex** | **Integer**| The new page position/index. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOptimizeDocument"></a>
# **postOptimizeDocument**
> AsposeResponse postOptimizeDocument(name, options, storage, folder)

Optimize document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **options** | [**OptimizeOptions**](OptimizeOptions.md)| The optimization options. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOrganizeDocument"></a>
# **postOrganizeDocument**
> AsposeResponse postOrganizeDocument(name, pages, outPath, storage, folder)

Merge selected pages of a document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The original document name. |
 **pages** | **String**| 1-based page numbers of the source document that make up the resulting document. |
 **outPath** | **String**| Full filename of the resulting document. |
 **storage** | **String**| The documents storage. | [optional]
 **folder** | **String**| The source document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOrganizeDocuments"></a>
# **postOrganizeDocuments**
> AsposeResponse postOrganizeDocuments(organizeDocuments, outPath, storage)

Merge selected pages of different documents.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizeDocuments** | [**OrganizeDocumentRequest**](OrganizeDocumentRequest.md)| Array of OrganizeDocumentData to make up the resulting document. |
 **outPath** | **String**| Full filename of the resulting document. |
 **storage** | **String**| The documents storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageCaretAnnotations"></a>
# **postPageCaretAnnotations**
> AsposeResponse postPageCaretAnnotations(name, pageNumber, annotations, storage, folder)

Add document page caret annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;CaretAnnotation&gt;**](CaretAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageCertify"></a>
# **postPageCertify**
> AsposeResponse postPageCertify(name, pageNumber, sign, docMdpAccessPermissionType, storage, folder)

Certify document page.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **sign** | [**Signature**](Signature.md)| Signature object containing signature data. |
 **docMdpAccessPermissionType** | **String**| The access permissions granted for this document. | [enum: NoChanges, FillingInForms, AnnotationModification]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageCircleAnnotations"></a>
# **postPageCircleAnnotations**
> AsposeResponse postPageCircleAnnotations(name, pageNumber, annotations, storage, folder)

Add document page circle annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;CircleAnnotation&gt;**](CircleAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageFileAttachmentAnnotations"></a>
# **postPageFileAttachmentAnnotations**
> AsposeResponse postPageFileAttachmentAnnotations(name, pageNumber, annotations, storage, folder)

Add document page FileAttachment annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;FileAttachmentAnnotation&gt;**](FileAttachmentAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageFreeTextAnnotations"></a>
# **postPageFreeTextAnnotations**
> AsposeResponse postPageFreeTextAnnotations(name, pageNumber, annotations, storage, folder)

Add document page free text annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;FreeTextAnnotation&gt;**](FreeTextAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageHighlightAnnotations"></a>
# **postPageHighlightAnnotations**
> AsposeResponse postPageHighlightAnnotations(name, pageNumber, annotations, storage, folder)

Add document page highlight annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;HighlightAnnotation&gt;**](HighlightAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageImageStamps"></a>
# **postPageImageStamps**
> AsposeResponse postPageImageStamps(name, pageNumber, stamps, storage, folder, password)

Add document page image stamps.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **stamps** | [**List&lt;ImageStamp&gt;**](ImageStamp.md)| The array of stamp. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageInkAnnotations"></a>
# **postPageInkAnnotations**
> AsposeResponse postPageInkAnnotations(name, pageNumber, annotations, storage, folder)

Add document page ink annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;InkAnnotation&gt;**](InkAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageLineAnnotations"></a>
# **postPageLineAnnotations**
> AsposeResponse postPageLineAnnotations(name, pageNumber, annotations, storage, folder)

Add document page line annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;LineAnnotation&gt;**](LineAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageLinkAnnotations"></a>
# **postPageLinkAnnotations**
> AsposeResponse postPageLinkAnnotations(name, pageNumber, links, storage, folder)

Add document page link annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **links** | [**List&lt;LinkAnnotation&gt;**](LinkAnnotation.md)| Array of link annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageMovieAnnotations"></a>
# **postPageMovieAnnotations**
> AsposeResponse postPageMovieAnnotations(name, pageNumber, annotations, storage, folder)

Add document page movie annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;MovieAnnotation&gt;**](MovieAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPagePdfPageStamps"></a>
# **postPagePdfPageStamps**
> AsposeResponse postPagePdfPageStamps(name, pageNumber, stamps, storage, folder, password)

Add document pdf page stamps.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **stamps** | [**List&lt;PdfPageStamp&gt;**](PdfPageStamp.md)| The array of stamp. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPagePolyLineAnnotations"></a>
# **postPagePolyLineAnnotations**
> AsposeResponse postPagePolyLineAnnotations(name, pageNumber, annotations, storage, folder)

Add document page polyline annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;PolyLineAnnotation&gt;**](PolyLineAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPagePolygonAnnotations"></a>
# **postPagePolygonAnnotations**
> AsposeResponse postPagePolygonAnnotations(name, pageNumber, annotations, storage, folder)

Add document page polygon annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;PolygonAnnotation&gt;**](PolygonAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageRedactionAnnotations"></a>
# **postPageRedactionAnnotations**
> AsposeResponse postPageRedactionAnnotations(name, pageNumber, annotations, storage, folder, apply)

Add document page redaction annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;RedactionAnnotation&gt;**](RedactionAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **apply** | **Boolean**| Apply redaction immediately after adding. | [optional] [default to false]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageScreenAnnotations"></a>
# **postPageScreenAnnotations**
> AsposeResponse postPageScreenAnnotations(name, pageNumber, annotations, storage, folder)

Add document page screen annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;ScreenAnnotation&gt;**](ScreenAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageSoundAnnotations"></a>
# **postPageSoundAnnotations**
> AsposeResponse postPageSoundAnnotations(name, pageNumber, annotations, storage, folder)

Add document page sound annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;SoundAnnotation&gt;**](SoundAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageSquareAnnotations"></a>
# **postPageSquareAnnotations**
> AsposeResponse postPageSquareAnnotations(name, pageNumber, annotations, storage, folder)

Add document page square annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;SquareAnnotation&gt;**](SquareAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageSquigglyAnnotations"></a>
# **postPageSquigglyAnnotations**
> AsposeResponse postPageSquigglyAnnotations(name, pageNumber, annotations, storage, folder)

Add document page squiggly annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;SquigglyAnnotation&gt;**](SquigglyAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageStampAnnotations"></a>
# **postPageStampAnnotations**
> AsposeResponse postPageStampAnnotations(name, pageNumber, annotations, storage, folder)

Add document page stamp annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;StampAnnotation&gt;**](StampAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageStrikeOutAnnotations"></a>
# **postPageStrikeOutAnnotations**
> AsposeResponse postPageStrikeOutAnnotations(name, pageNumber, annotations, storage, folder)

Add document page StrikeOut annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;StrikeOutAnnotation&gt;**](StrikeOutAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageTables"></a>
# **postPageTables**
> AsposeResponse postPageTables(name, pageNumber, tables, storage, folder)

Add document page tables.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **tables** | [**List&lt;Table&gt;**](Table.md)| The array of table. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageTextAnnotations"></a>
# **postPageTextAnnotations**
> AsposeResponse postPageTextAnnotations(name, pageNumber, annotations, storage, folder)

Add document page text annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;TextAnnotation&gt;**](TextAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageTextReplace"></a>
# **postPageTextReplace**
> TextReplaceResponse postPageTextReplace(name, pageNumber, textReplaceListRequest, storage, folder)

Page&#39;s replace text method.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **pageNumber** | **Integer**|  |
 **textReplaceListRequest** | [**TextReplaceListRequest**](TextReplaceListRequest.md)|  |
 **storage** | **String**|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**TextReplaceResponse**](TextReplaceResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageTextStamps"></a>
# **postPageTextStamps**
> AsposeResponse postPageTextStamps(name, pageNumber, stamps, storage, folder, password)

Add document page text stamps.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **stamps** | [**List&lt;TextStamp&gt;**](TextStamp.md)| The array of stamp. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageUnderlineAnnotations"></a>
# **postPageUnderlineAnnotations**
> AsposeResponse postPageUnderlineAnnotations(name, pageNumber, annotations, storage, folder)

Add document page underline annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;UnderlineAnnotation&gt;**](UnderlineAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPdfToXlsx"></a>
# **postPdfToXlsx**
> File postPdfToXlsx(insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, uniformWorksheets, password, file)

Converts PDF document (in request content) to XLSX format and uploads and returns resulting file in response content.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insertBlankColumnAtFirst** | **Boolean**| Insert blank column at first | [optional]
 **minimizeTheNumberOfWorksheets** | **Boolean**| Minimize the number of worksheets | [optional]
 **uniformWorksheets** | **Boolean**| Uniform worksheets | [optional]
 **password** | **String**| The password (Base64). | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

**File**

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: multipart/form-data

<a name="postPopupAnnotation"></a>
# **postPopupAnnotation**
> AsposeResponse postPopupAnnotation(name, annotationId, annotation, storage, folder)

Add document popup annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The parent annotation ID. |
 **annotation** | [**PopupAnnotation**](PopupAnnotation.md)| The annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postRadioButtonFields"></a>
# **postRadioButtonFields**
> AsposeResponse postRadioButtonFields(name, fields, storage, folder)

Add document RadioButton fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fields** | [**List&lt;RadioButtonField&gt;**](RadioButtonField.md)| The array of field. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSignDocument"></a>
# **postSignDocument**
> AsposeResponse postSignDocument(name, sign, storage, folder)

Sign document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sign** | [**Signature**](Signature.md)| Signature object containing signature data. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSignPage"></a>
# **postSignPage**
> AsposeResponse postSignPage(name, pageNumber, sign, storage, folder)

Sign page.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **sign** | [**Signature**](Signature.md)| Signature object containing signature data. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSignatureField"></a>
# **postSignatureField**
> AsposeResponse postSignatureField(name, field, storage, folder)

Add document signature field.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **field** | [**SignatureField**](SignatureField.md)| The field. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSplitDocument"></a>
# **postSplitDocument**
> SplitResultResponse postSplitDocument(name, format, from, to, storage, folder, password)

Split document to parts.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **format** | **String**| Resulting documents format. | [optional]
 **from** | **Integer**| Start page if defined. | [optional]
 **to** | **Integer**| End page if defined. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**SplitResultResponse**](SplitResultResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSplitRangePdfDocument"></a>
# **postSplitRangePdfDocument**
> SplitResultResponse postSplitRangePdfDocument(name, options, storage, folder, password)

Split document into ranges.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **options** | [**SplitRangePdfOptions**](SplitRangePdfOptions.md)| The splitting options. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**SplitResultResponse**](SplitResultResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTextBoxFields"></a>
# **postTextBoxFields**
> AsposeResponse postTextBoxFields(name, fields, storage, folder)

Add document text box fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fields** | [**List&lt;TextBoxField&gt;**](TextBoxField.md)| The array of field. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postXmpMetadata"></a>
# **postXmpMetadata**
> AsposeResponse postXmpMetadata(name, metadata, folder, storage, passBase64)

Add or remove XMP Metadata properties.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **metadata** | [**XmpMetadata**](XmpMetadata.md)| XmpMetadata instance. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **passBase64** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAddNewPage"></a>
# **putAddNewPage**
> DocumentPagesResponse putAddNewPage(name, storage, folder)

Add new page to end of the document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**DocumentPagesResponse**](DocumentPagesResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAddText"></a>
# **putAddText**
> AsposeResponse putAddText(name, pageNumber, paragraph, folder, storage)

Add text to PDF document page.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| Number of page (starting from 1). |
 **paragraph** | [**Paragraph**](Paragraph.md)| Paragraph data. |
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAnnotationsFlatten"></a>
# **putAnnotationsFlatten**
> AsposeResponse putAnnotationsFlatten(name, startPage, endPage, annotationTypes, storage, folder)

Flattens the annotations of the specified types

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **startPage** | **Integer**| The start page number. | [optional]
 **endPage** | **Integer**| The end page number. | [optional]
 **annotationTypes** | [**List&lt;AnnotationType&gt;**](AnnotationType.md)| Array of annotation types. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putApsInStorageToPdf"></a>
# **putApsInStorageToPdf**
> AsposeResponse putApsInStorageToPdf(name, srcPath, dstFolder, storage)

Convert APS file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xps) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putBookmark"></a>
# **putBookmark**
> BookmarkResponse putBookmark(name, bookmarkPath, bookmark, folder, storage, password)

Update document bookmark.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **bookmarkPath** | **String**| The bookmark path. |
 **bookmark** | [**Bookmark**](Bookmark.md)| The bookmark. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**BookmarkResponse**](BookmarkResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCaretAnnotation"></a>
# **putCaretAnnotation**
> CaretAnnotationResponse putCaretAnnotation(name, annotationId, annotation, storage, folder)

Replace document caret annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**CaretAnnotation**](CaretAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CaretAnnotationResponse**](CaretAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putChangePasswordDocument"></a>
# **putChangePasswordDocument**
> AsposeResponse putChangePasswordDocument(outPath, ownerPassword, newUserPassword, newOwnerPassword, storage, file)

Change document password from content.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.doc) |
 **ownerPassword** | **String**| Owner password (encrypted Base64). |
 **newUserPassword** | **String**| New user password (encrypted Base64). |
 **newOwnerPassword** | **String**| New owner password (encrypted Base64). |
 **storage** | **String**| The document storage. | [optional]
 **file** | **File**| A file to be changed password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putCheckBoxField"></a>
# **putCheckBoxField**
> CheckBoxFieldResponse putCheckBoxField(name, fieldName, field, storage, folder)

Replace document checkbox field

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name. |
 **field** | [**CheckBoxField**](CheckBoxField.md)| The field. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CheckBoxFieldResponse**](CheckBoxFieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCircleAnnotation"></a>
# **putCircleAnnotation**
> CircleAnnotationResponse putCircleAnnotation(name, annotationId, annotation, storage, folder)

Replace document circle annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**CircleAnnotation**](CircleAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CircleAnnotationResponse**](CircleAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putComboBoxField"></a>
# **putComboBoxField**
> ComboBoxFieldResponse putComboBoxField(name, fieldName, field, storage, folder)

Replace document combobox field

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name. |
 **field** | [**ComboBoxField**](ComboBoxField.md)| The field. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ComboBoxFieldResponse**](ComboBoxFieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCreateDocument"></a>
# **putCreateDocument**
> DocumentResponse putCreateDocument(name, storage, folder)

Create empty document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The new document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The new document folder. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCreatePdfFromLayer"></a>
# **putCreatePdfFromLayer**
> AsposeResponse putCreatePdfFromLayer(name, pageNumber, outPath, layerId, folder, storage, passBase64)

Create a separate PDF from a PDF Layer and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **layerId** | **String**| Layer Id. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **passBase64** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putDecryptDocument"></a>
# **putDecryptDocument**
> AsposeResponse putDecryptDocument(outPath, password, storage, file)

Decrypt document from content.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.doc) |
 **password** | **String**| The password (encrypted Base64). |
 **storage** | **String**| The document storage. | [optional]
 **file** | **File**| A file to be decrypted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putDocumentDisplayProperties"></a>
# **putDocumentDisplayProperties**
> DisplayPropertiesResponse putDocumentDisplayProperties(name, displayProperties, storage, folder)

Update document display properties.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **displayProperties** | [**DisplayProperties**](DisplayProperties.md)| The display properties. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**DisplayPropertiesResponse**](DisplayPropertiesResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putEncryptDocument"></a>
# **putEncryptDocument**
> AsposeResponse putEncryptDocument(outPath, userPassword, ownerPassword, cryptoAlgorithm, permissionsFlags, usePdf20, storage, file)

Encrypt document from content.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.doc) |
 **userPassword** | **String**| User password (encrypted Base64). |
 **ownerPassword** | **String**| Owner password (encrypted Base64). |
 **cryptoAlgorithm** | **String**| Cryptographic algorithm, see CryptoAlgorithm for details. | [enum: RC4x40, RC4x128, AESx128, AESx256]
 **permissionsFlags** | [**List&lt;PermissionsFlags&gt;**](PermissionsFlags.md)| Array of document permissions, see PermissionsFlags for details. | [optional]
 **usePdf20** | **Boolean**| Support for revision 6 (Extension 8). | [optional]
 **storage** | **String**| The document storage. | [optional]
 **file** | **File**| A file to be encrypted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putEpubInStorageToPdf"></a>
# **putEpubInStorageToPdf**
> AsposeResponse putEpubInStorageToPdf(name, srcPath, storage, dstFolder)

Convert EPUB file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.epub) |
 **storage** | **String**| The document storage. | [optional]
 **dstFolder** | **String**| The destination document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putExportFieldsFromPdfToFdfInStorage"></a>
# **putExportFieldsFromPdfToFdfInStorage**
> AsposeResponse putExportFieldsFromPdfToFdfInStorage(name, fdfOutputFilePath, storage, folder)

Export fields from from PDF in storage to FDF file in storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fdfOutputFilePath** | **String**| The output Fdf file path. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putExportFieldsFromPdfToXfdfInStorage"></a>
# **putExportFieldsFromPdfToXfdfInStorage**
> AsposeResponse putExportFieldsFromPdfToXfdfInStorage(name, xfdfOutputFilePath, storage, folder)

Export fields from from PDF in storage to XFDF file in storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **xfdfOutputFilePath** | **String**| The output xfdf file path. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putExportFieldsFromPdfToXmlInStorage"></a>
# **putExportFieldsFromPdfToXmlInStorage**
> AsposeResponse putExportFieldsFromPdfToXmlInStorage(name, xmlOutputFilePath, storage, folder)

Export fields from from PDF in storage to XML file in storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **xmlOutputFilePath** | **String**| The output xml file path. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFieldsFlatten"></a>
# **putFieldsFlatten**
> AsposeResponse putFieldsFlatten(name, storage, folder)

Flatten form fields in document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFileAttachmentAnnotation"></a>
# **putFileAttachmentAnnotation**
> FileAttachmentAnnotationResponse putFileAttachmentAnnotation(name, annotationId, annotation, storage, folder)

Replace document FileAttachment annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**FileAttachmentAnnotation**](FileAttachmentAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FileAttachmentAnnotationResponse**](FileAttachmentAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFileAttachmentAnnotationDataExtract"></a>
# **putFileAttachmentAnnotationDataExtract**
> AsposeResponse putFileAttachmentAnnotationDataExtract(name, annotationId, outFolder, storage, folder)

Extract document FileAttachment annotation content to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **outFolder** | **String**| The output folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFreeTextAnnotation"></a>
# **putFreeTextAnnotation**
> FreeTextAnnotationResponse putFreeTextAnnotation(name, annotationId, annotation, storage, folder)

Replace document free text annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**FreeTextAnnotation**](FreeTextAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FreeTextAnnotationResponse**](FreeTextAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putHighlightAnnotation"></a>
# **putHighlightAnnotation**
> HighlightAnnotationResponse putHighlightAnnotation(name, annotationId, annotation, storage, folder)

Replace document highlight annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**HighlightAnnotation**](HighlightAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**HighlightAnnotationResponse**](HighlightAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putHtmlInStorageToPdf"></a>
# **putHtmlInStorageToPdf**
> AsposeResponse putHtmlInStorageToPdf(name, srcPath, htmlFileName, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, dstFolder, storage)

Convert HTML file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.zip) |
 **htmlFileName** | **String**| Name of HTML file in ZIP. | [optional]
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImageExtractAsGif"></a>
# **putImageExtractAsGif**
> AsposeResponse putImageExtractAsGif(name, imageId, width, height, storage, folder, destFolder)

Extract document image in GIF format to folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImageExtractAsJpeg"></a>
# **putImageExtractAsJpeg**
> AsposeResponse putImageExtractAsJpeg(name, imageId, width, height, storage, folder, destFolder)

Extract document image in JPEG format to folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImageExtractAsPng"></a>
# **putImageExtractAsPng**
> AsposeResponse putImageExtractAsPng(name, imageId, width, height, storage, folder, destFolder)

Extract document image in PNG format to folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImageExtractAsTiff"></a>
# **putImageExtractAsTiff**
> AsposeResponse putImageExtractAsTiff(name, imageId, width, height, storage, folder, destFolder)

Extract document image in TIFF format to folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImageInStorageToPdf"></a>
# **putImageInStorageToPdf**
> AsposeResponse putImageInStorageToPdf(name, imageTemplates, dstFolder, storage)

Convert image file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageTemplates** | [**ImageTemplatesRequest**](ImageTemplatesRequest.md)| ImageTemplatesRequestImage templates |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImagesExtractAsGif"></a>
# **putImagesExtractAsGif**
> AsposeResponse putImagesExtractAsGif(name, pageNumber, width, height, storage, folder, destFolder)

Extract document images in GIF format to folder.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImagesExtractAsJpeg"></a>
# **putImagesExtractAsJpeg**
> AsposeResponse putImagesExtractAsJpeg(name, pageNumber, width, height, storage, folder, destFolder)

Extract document images in JPEG format to folder.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImagesExtractAsPng"></a>
# **putImagesExtractAsPng**
> AsposeResponse putImagesExtractAsPng(name, pageNumber, width, height, storage, folder, destFolder)

Extract document images in PNG format to folder.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImagesExtractAsTiff"></a>
# **putImagesExtractAsTiff**
> AsposeResponse putImagesExtractAsTiff(name, pageNumber, width, height, storage, folder, destFolder)

Extract document images in TIFF format to folder.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImportFieldsFromFdfInStorage"></a>
# **putImportFieldsFromFdfInStorage**
> AsposeResponse putImportFieldsFromFdfInStorage(name, fdfFilePath, storage, folder)

Update fields from FDF file in storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fdfFilePath** | **String**| The Fdf file path. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImportFieldsFromXfdfInStorage"></a>
# **putImportFieldsFromXfdfInStorage**
> AsposeResponse putImportFieldsFromXfdfInStorage(name, xfdfFilePath, storage, folder)

Update fields from XFDF file in storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **xfdfFilePath** | **String**| The XFDF file path. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImportFieldsFromXmlInStorage"></a>
# **putImportFieldsFromXmlInStorage**
> AsposeResponse putImportFieldsFromXmlInStorage(name, xmlFilePath, storage, folder)

Update fields from XML file in storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **xmlFilePath** | **String**| Full source filename (ex. /folder1/folder2/template.xml) |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putInkAnnotation"></a>
# **putInkAnnotation**
> InkAnnotationResponse putInkAnnotation(name, annotationId, annotation, storage, folder)

Replace document ink annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**InkAnnotation**](InkAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**InkAnnotationResponse**](InkAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putLineAnnotation"></a>
# **putLineAnnotation**
> LineAnnotationResponse putLineAnnotation(name, annotationId, annotation, storage, folder)

Replace document line annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**LineAnnotation**](LineAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**LineAnnotationResponse**](LineAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putLinkAnnotation"></a>
# **putLinkAnnotation**
> LinkAnnotationResponse putLinkAnnotation(name, linkId, link, storage, folder)

Replace document page link annotations

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **linkId** | **String**| The link ID. |
 **link** | [**LinkAnnotation**](LinkAnnotation.md)| Link annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**LinkAnnotationResponse**](LinkAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putListBoxField"></a>
# **putListBoxField**
> ListBoxFieldResponse putListBoxField(name, fieldName, field, storage, folder)

Replace document listbox field

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name. |
 **field** | [**ListBoxField**](ListBoxField.md)| The field. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ListBoxFieldResponse**](ListBoxFieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMarkdownInStorageToPdf"></a>
# **putMarkdownInStorageToPdf**
> AsposeResponse putMarkdownInStorageToPdf(name, srcPath, storage, dstFolder)

Convert MD file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.md) |
 **storage** | **String**| The document storage. | [optional]
 **dstFolder** | **String**| The destination document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMergeDocuments"></a>
# **putMergeDocuments**
> DocumentResponse putMergeDocuments(name, mergeDocuments, storage, folder)

Merge a list of documents.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Resulting document name. |
 **mergeDocuments** | [**MergeDocuments**](MergeDocuments.md)| MergeDocuments with a list of documents. |
 **storage** | **String**| Resulting document storage. | [optional]
 **folder** | **String**| Resulting document folder. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMhtInStorageToPdf"></a>
# **putMhtInStorageToPdf**
> AsposeResponse putMhtInStorageToPdf(name, srcPath, height, width, marginLeft, marginBottom, marginRight, marginTop, dstFolder, storage)

Convert MHT file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.mht) |
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMovieAnnotation"></a>
# **putMovieAnnotation**
> MovieAnnotationResponse putMovieAnnotation(name, annotationId, annotation, storage, folder)

Replace document movie annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**MovieAnnotation**](MovieAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**MovieAnnotationResponse**](MovieAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageAddStamp"></a>
# **putPageAddStamp**
> AsposeResponse putPageAddStamp(name, pageNumber, stamp, storage, folder)

Add page stamp.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **stamp** | [**Stamp**](Stamp.md)| Stamp with data. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageConvertToBmp"></a>
# **putPageConvertToBmp**
> AsposeResponse putPageConvertToBmp(name, pageNumber, outPath, width, height, folder, storage, password)

Convert document page to bmp image and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageConvertToEmf"></a>
# **putPageConvertToEmf**
> AsposeResponse putPageConvertToEmf(name, pageNumber, outPath, width, height, folder, storage, password)

Convert document page to emf image and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageConvertToGif"></a>
# **putPageConvertToGif**
> AsposeResponse putPageConvertToGif(name, pageNumber, outPath, width, height, folder, storage, password)

Convert document page to gif image and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageConvertToJpeg"></a>
# **putPageConvertToJpeg**
> AsposeResponse putPageConvertToJpeg(name, pageNumber, outPath, width, height, folder, storage, password)

Convert document page to Jpeg image and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageConvertToPng"></a>
# **putPageConvertToPng**
> AsposeResponse putPageConvertToPng(name, pageNumber, outPath, width, height, folder, storage, password)

Convert document page to png image and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageConvertToTiff"></a>
# **putPageConvertToTiff**
> AsposeResponse putPageConvertToTiff(name, pageNumber, outPath, width, height, folder, storage, password)

Convert document page to Tiff image and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **width** | **Integer**| The converted image width. | [optional] [default to 0]
 **height** | **Integer**| The converted image height. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPclInStorageToPdf"></a>
# **putPclInStorageToPdf**
> AsposeResponse putPclInStorageToPdf(name, srcPath, dstFolder, storage)

Convert PCL file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.pcl) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfAInStorageToPdf"></a>
# **putPdfAInStorageToPdf**
> AsposeResponse putPdfAInStorageToPdf(name, srcPath, dstFolder, dontOptimize, storage)

Convert PDFA file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.pdf) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **dontOptimize** | **Boolean**| If set, document resources will not be optimized. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToAps"></a>
# **putPdfInRequestToAps**
> AsposeResponse putPdfInRequestToAps(outPath, storage, file)

Converts PDF document (in request content) to APS format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.aps) |
 **storage** | **String**| The document storage. | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToDoc"></a>
# **putPdfInRequestToDoc**
> AsposeResponse putPdfInRequestToDoc(outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, storage, password, file)

Converts PDF document (in request content) to DOC format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.doc) |
 **addReturnToLineEnd** | **Boolean**| Add return to line end. | [optional]
 **format** | **String**| Allows to specify .doc or .docx file format. | [optional] [enum: Doc, DocX]
 **imageResolutionX** | **Integer**| Image resolution X. | [optional]
 **imageResolutionY** | **Integer**| Image resolution Y. | [optional]
 **maxDistanceBetweenTextLines** | **Double**| Max distance between text lines. | [optional]
 **mode** | **String**| Allows to control how a PDF document is converted into a word processing document. | [optional] [enum: Textbox, Flow, EnhancedFlow]
 **recognizeBullets** | **Boolean**| Recognize bullets. | [optional]
 **relativeHorizontalProximity** | **Double**| Relative horizontal proximity. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToEpub"></a>
# **putPdfInRequestToEpub**
> AsposeResponse putPdfInRequestToEpub(outPath, contentRecognitionMode, storage, file)

Converts PDF document (in request content) to EPUB format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.epub) |
 **contentRecognitionMode** | **String**| Property tunes conversion for this or that desirable method of recognition of content. | [optional] [enum: Flow, PdfFlow, Fixed]
 **storage** | **String**| The document storage. | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToHtml"></a>
# **putPdfInRequestToHtml**
> AsposeResponse putPdfInRequestToHtml(outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, storage, flowLayoutParagraphFullWidth, outputFormat, file)

Converts PDF document (in request content) to Html format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.html) |
 **additionalMarginWidthInPoints** | **Integer**| Defines width of margin that will be forcibly left around that output HTML-areas. | [optional]
 **compressSvgGraphicsIfAny** | **Boolean**| The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. | [optional]
 **convertMarkedContentToLayers** | **Boolean**| If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with &quot;data-pdflayer&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. | [optional]
 **defaultFontName** | **String**| Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. | [optional]
 **documentType** | **String**| Result document type. | [optional] [enum: Xhtml, Html5]
 **fixedLayout** | **Boolean**| The value indicating whether that HTML is created as fixed layout. | [optional]
 **imageResolution** | **Integer**| Resolution for image rendering. | [optional]
 **minimalLineWidth** | **Integer**| This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. | [optional]
 **preventGlyphsGrouping** | **Boolean**| This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. | [optional]
 **splitCssIntoPages** | **Boolean**| When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. | [optional]
 **splitIntoPages** | **Boolean**| The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. | [optional]
 **useZOrder** | **Boolean**| If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. | [optional]
 **antialiasingProcessing** | **String**| The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. | [optional] [enum: NoAdditionalProcessing, TryCorrectResultHtml]
 **cssClassNamesPrefix** | **String**| When PDFtoHTML converter generates result CSSs, CSS class names (something like &quot;.stl_01 {}&quot; ... &quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. | [optional]
 **explicitListOfSavedPages** | **List&lt;Integer&gt;**| With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. | [optional]
 **fontEncodingStrategy** | **String**| Defines encoding special rule to tune PDF decoding for current document. | [optional] [enum: Default, DecreaseToUnicodePriorityLevel]
 **fontSavingMode** | **String**| Defines font saving mode that will be used during saving of PDF to desirable format. | [optional] [enum: AlwaysSaveAsWOFF, AlwaysSaveAsTTF, AlwaysSaveAsEOT, SaveInAllFormats]
 **htmlMarkupGenerationMode** | **String**| Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. | [optional] [enum: WriteAllHtml, WriteOnlyBodyContent]
 **lettersPositioningMethod** | **String**| The mode of positioning of letters in words in result HTML. | [optional] [enum: UseEmUnitsAndCompensationOfRoundingErrorsInCss, UsePixelUnitsInCssLetterSpacingForIE]
 **pagesFlowTypeDependsOnViewersScreenSize** | **Boolean**| If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. | [optional]
 **partsEmbeddingMode** | **String**| It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. | [optional] [enum: EmbedAllIntoHtml, EmbedCssOnly, NoEmbedding]
 **rasterImagesSavingMode** | **String**| Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. | [optional] [enum: AsPngImagesEmbeddedIntoSvg, AsExternalPngFilesReferencedViaSvg, AsEmbeddedPartsOfPngPageBackground]
 **removeEmptyAreasOnTopAndBottom** | **Boolean**| Defines whether in created HTML will be removed top and bottom empty area without any content (if any). | [optional]
 **saveShadowedTextsAsTransparentTexts** | **Boolean**| Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). | [optional]
 **saveTransparentTexts** | **Boolean**| Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. | [optional]
 **specialFolderForAllImages** | **String**| The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. | [optional]
 **specialFolderForSvgImages** | **String**| The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. | [optional]
 **trySaveTextUnderliningAndStrikeoutingInCss** | **Boolean**| PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **flowLayoutParagraphFullWidth** | **Boolean**| This attribute specifies full width paragraph text for Flow mode, FixedLayout &#x3D; false. | [optional]
 **outputFormat** | **String**| This parameter determines the type of result. The zip archive will be uploaded into the storage if the parameter is &quot;Zip&quot; or missed (default). In case of the &quot;Folder&quot;, all resulting files and directories will be uploaded to the folder of the resulting HTML file. | [optional] [default to Zip] [enum: Zip, Folder]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToMobiXml"></a>
# **putPdfInRequestToMobiXml**
> AsposeResponse putPdfInRequestToMobiXml(outPath, storage, file)

Converts PDF document (in request content) to MOBIXML format and uploads resulting ZIP archive file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.mobixml) |
 **storage** | **String**| The document storage. | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToPdfA"></a>
# **putPdfInRequestToPdfA**
> AsposeResponse putPdfInRequestToPdfA(outPath, type, storage, password, file)

Converts PDF document (in request content) to PdfA format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.pdf) |
 **type** | **String**| Type of PdfA format. | [enum: PDFA1A, PDFA1B, PDFA3A, PDFA3B]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToPptx"></a>
# **putPdfInRequestToPptx**
> AsposeResponse putPdfInRequestToPptx(outPath, separateImages, slidesAsImages, storage, password, file)

Converts PDF document (in request content) to PPTX format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.pptx) |
 **separateImages** | **Boolean**| Separate images. | [optional]
 **slidesAsImages** | **Boolean**| Slides as images. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToSvg"></a>
# **putPdfInRequestToSvg**
> AsposeResponse putPdfInRequestToSvg(outPath, storage, password, file)

Converts PDF document (in request content) to SVG format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.svg) |
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToTeX"></a>
# **putPdfInRequestToTeX**
> AsposeResponse putPdfInRequestToTeX(outPath, storage, file)

Converts PDF document (in request content) to TeX format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.tex) |
 **storage** | **String**| The document storage. | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToTiff"></a>
# **putPdfInRequestToTiff**
> AsposeResponse putPdfInRequestToTiff(outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, storage, file)

Converts PDF document (in request content) to TIFF format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.tiff) |
 **brightness** | **Double**| Image brightness. | [optional]
 **compression** | **String**| Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. | [optional] [enum: LZW, CCITT4, CCITT3, RLE, None]
 **colorDepth** | **String**| Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. | [optional] [enum: Default, Format8bpp, Format4bpp, Format1bpp]
 **leftMargin** | **Integer**| Left image margin. | [optional]
 **rightMargin** | **Integer**| Right image margin. | [optional]
 **topMargin** | **Integer**| Top image margin. | [optional]
 **bottomMargin** | **Integer**| Bottom image margin. | [optional]
 **orientation** | **String**| Image orientation. Possible values are: None, Landscape, Portait. | [optional] [enum: None, Landscape, Portrait]
 **skipBlankPages** | **Boolean**| Skip blank pages flag. | [optional]
 **width** | **Integer**| Image width. | [optional]
 **height** | **Integer**| Image height. | [optional]
 **xResolution** | **Integer**| Horizontal resolution. | [optional]
 **yResolution** | **Integer**| Vertical resolution. | [optional]
 **pageIndex** | **Integer**| Start page to export. | [optional]
 **pageCount** | **Integer**| Number of pages to export. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToXls"></a>
# **putPdfInRequestToXls**
> AsposeResponse putPdfInRequestToXls(outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, storage, password, file)

Converts PDF document (in request content) to XLS format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xls) |
 **insertBlankColumnAtFirst** | **Boolean**| Insert blank column at first | [optional]
 **minimizeTheNumberOfWorksheets** | **Boolean**| Minimize the number of worksheets | [optional]
 **scaleFactor** | **Double**| Scale factor (Obsolete) | [optional]
 **uniformWorksheets** | **Boolean**| Uniform worksheets | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToXlsx"></a>
# **putPdfInRequestToXlsx**
> AsposeResponse putPdfInRequestToXlsx(outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, storage, password, file)

Converts PDF document (in request content) to XLSX format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xlsx) |
 **insertBlankColumnAtFirst** | **Boolean**| Insert blank column at first | [optional]
 **minimizeTheNumberOfWorksheets** | **Boolean**| Minimize the number of worksheets | [optional]
 **scaleFactor** | **Double**| Scale factor (Obsolete) | [optional]
 **uniformWorksheets** | **Boolean**| Uniform worksheets | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToXml"></a>
# **putPdfInRequestToXml**
> AsposeResponse putPdfInRequestToXml(outPath, storage, file)

Converts PDF document (in request content) to XML format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xml) |
 **storage** | **String**| The document storage. | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInRequestToXps"></a>
# **putPdfInRequestToXps**
> AsposeResponse putPdfInRequestToXps(outPath, storage, file)

Converts PDF document (in request content) to XPS format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xps) |
 **storage** | **String**| The document storage. | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putPdfInStorageToAps"></a>
# **putPdfInStorageToAps**
> AsposeResponse putPdfInStorageToAps(name, outPath, folder, storage)

Converts PDF document (located on storage) to APS format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.aps) |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToDoc"></a>
# **putPdfInStorageToDoc**
> AsposeResponse putPdfInStorageToDoc(name, outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder, storage, password)

Converts PDF document (located on storage) to DOC format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.doc) |
 **addReturnToLineEnd** | **Boolean**| Add return to line end. | [optional]
 **format** | **String**| Allows to specify .doc or .docx file format. | [optional] [enum: Doc, DocX]
 **imageResolutionX** | **Integer**| Image resolution X. | [optional]
 **imageResolutionY** | **Integer**| Image resolution Y. | [optional]
 **maxDistanceBetweenTextLines** | **Double**| Max distance between text lines. | [optional]
 **mode** | **String**| Allows to control how a PDF document is converted into a word processing document. | [optional] [enum: Textbox, Flow, EnhancedFlow]
 **recognizeBullets** | **Boolean**| Recognize bullets. | [optional]
 **relativeHorizontalProximity** | **Double**| Relative horizontal proximity. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToEpub"></a>
# **putPdfInStorageToEpub**
> AsposeResponse putPdfInStorageToEpub(name, outPath, contentRecognitionMode, folder, storage)

Converts PDF document (located on storage) to EPUB format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.epub) |
 **contentRecognitionMode** | **String**| Property tunes conversion for this or that desirable method of recognition of content. | [optional] [enum: Flow, PdfFlow, Fixed]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToHtml"></a>
# **putPdfInStorageToHtml**
> AsposeResponse putPdfInStorageToHtml(name, outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder, storage, flowLayoutParagraphFullWidth, outputFormat)

Converts PDF document (located on storage) to Html format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.html) |
 **additionalMarginWidthInPoints** | **Integer**| Defines width of margin that will be forcibly left around that output HTML-areas. | [optional]
 **compressSvgGraphicsIfAny** | **Boolean**| The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. | [optional]
 **convertMarkedContentToLayers** | **Boolean**| If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with &quot;data-pdflayer&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. | [optional]
 **defaultFontName** | **String**| Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. | [optional]
 **documentType** | **String**| Result document type. | [optional] [enum: Xhtml, Html5]
 **fixedLayout** | **Boolean**| The value indicating whether that HTML is created as fixed layout. | [optional]
 **imageResolution** | **Integer**| Resolution for image rendering. | [optional]
 **minimalLineWidth** | **Integer**| This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. | [optional]
 **preventGlyphsGrouping** | **Boolean**| This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. | [optional]
 **splitCssIntoPages** | **Boolean**| When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. | [optional]
 **splitIntoPages** | **Boolean**| The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. | [optional]
 **useZOrder** | **Boolean**| If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. | [optional]
 **antialiasingProcessing** | **String**| The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. | [optional] [enum: NoAdditionalProcessing, TryCorrectResultHtml]
 **cssClassNamesPrefix** | **String**| When PDFtoHTML converter generates result CSSs, CSS class names (something like &quot;.stl_01 {}&quot; ... &quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. | [optional]
 **explicitListOfSavedPages** | **List&lt;Integer&gt;**| With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. | [optional]
 **fontEncodingStrategy** | **String**| Defines encoding special rule to tune PDF decoding for current document. | [optional] [enum: Default, DecreaseToUnicodePriorityLevel]
 **fontSavingMode** | **String**| Defines font saving mode that will be used during saving of PDF to desirable format. | [optional] [enum: AlwaysSaveAsWOFF, AlwaysSaveAsTTF, AlwaysSaveAsEOT, SaveInAllFormats]
 **htmlMarkupGenerationMode** | **String**| Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. | [optional] [enum: WriteAllHtml, WriteOnlyBodyContent]
 **lettersPositioningMethod** | **String**| The mode of positioning of letters in words in result HTML. | [optional] [enum: UseEmUnitsAndCompensationOfRoundingErrorsInCss, UsePixelUnitsInCssLetterSpacingForIE]
 **pagesFlowTypeDependsOnViewersScreenSize** | **Boolean**| If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. | [optional]
 **partsEmbeddingMode** | **String**| It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. | [optional] [enum: EmbedAllIntoHtml, EmbedCssOnly, NoEmbedding]
 **rasterImagesSavingMode** | **String**| Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. | [optional] [enum: AsPngImagesEmbeddedIntoSvg, AsExternalPngFilesReferencedViaSvg, AsEmbeddedPartsOfPngPageBackground]
 **removeEmptyAreasOnTopAndBottom** | **Boolean**| Defines whether in created HTML will be removed top and bottom empty area without any content (if any). | [optional]
 **saveShadowedTextsAsTransparentTexts** | **Boolean**| Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). | [optional]
 **saveTransparentTexts** | **Boolean**| Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. | [optional]
 **specialFolderForAllImages** | **String**| The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. | [optional]
 **specialFolderForSvgImages** | **String**| The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. | [optional]
 **trySaveTextUnderliningAndStrikeoutingInCss** | **Boolean**| PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **flowLayoutParagraphFullWidth** | **Boolean**| This attribute specifies full width paragraph text for Flow mode, FixedLayout &#x3D; false. | [optional]
 **outputFormat** | **String**| This parameter determines the type of result. The zip archive will be uploaded into the storage if the parameter is &quot;Zip&quot; or missed (default). In case of the &quot;Folder&quot;, all resulting files and directories will be uploaded to the folder of the resulting HTML file. | [optional] [default to Zip] [enum: Zip, Folder]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToMobiXml"></a>
# **putPdfInStorageToMobiXml**
> AsposeResponse putPdfInStorageToMobiXml(name, outPath, folder, storage)

Converts PDF document (located on storage) to MOBIXML format and uploads resulting ZIP archive file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.mobixml) |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToPdfA"></a>
# **putPdfInStorageToPdfA**
> AsposeResponse putPdfInStorageToPdfA(name, outPath, type, folder, storage, password)

Converts PDF document (located on storage) to PdfA format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.pdf) |
 **type** | **String**| Type of PdfA format. | [enum: PDFA1A, PDFA1B, PDFA3A, PDFA3B]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToPptx"></a>
# **putPdfInStorageToPptx**
> AsposeResponse putPdfInStorageToPptx(name, outPath, separateImages, slidesAsImages, folder, storage, password)

Converts PDF document (located on storage) to PPTX format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.pptx) |
 **separateImages** | **Boolean**| Separate images. | [optional]
 **slidesAsImages** | **Boolean**| Slides as images. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| Base64 encoded password. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToSvg"></a>
# **putPdfInStorageToSvg**
> AsposeResponse putPdfInStorageToSvg(name, outPath, folder, storage, password)

Converts PDF document (located on storage) to SVG format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.svg) |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToTeX"></a>
# **putPdfInStorageToTeX**
> AsposeResponse putPdfInStorageToTeX(name, outPath, folder, storage)

Converts PDF document (located on storage) to TeX format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.tex) |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToTiff"></a>
# **putPdfInStorageToTiff**
> AsposeResponse putPdfInStorageToTiff(name, outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder, storage)

Converts PDF document (located on storage) to TIFF format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.tiff) |
 **brightness** | **Double**| Image brightness. | [optional]
 **compression** | **String**| Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. | [optional] [enum: LZW, CCITT4, CCITT3, RLE, None]
 **colorDepth** | **String**| Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. | [optional] [enum: Default, Format8bpp, Format4bpp, Format1bpp]
 **leftMargin** | **Integer**| Left image margin. | [optional]
 **rightMargin** | **Integer**| Right image margin. | [optional]
 **topMargin** | **Integer**| Top image margin. | [optional]
 **bottomMargin** | **Integer**| Bottom image margin. | [optional]
 **orientation** | **String**| Image orientation. Possible values are: None, Landscape, Portait. | [optional] [enum: None, Landscape, Portrait]
 **skipBlankPages** | **Boolean**| Skip blank pages flag. | [optional]
 **width** | **Integer**| Image width. | [optional]
 **height** | **Integer**| Image height. | [optional]
 **xResolution** | **Integer**| Horizontal resolution. | [optional]
 **yResolution** | **Integer**| Vertical resolution. | [optional]
 **pageIndex** | **Integer**| Start page to export. | [optional]
 **pageCount** | **Integer**| Number of pages to export. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToXls"></a>
# **putPdfInStorageToXls**
> AsposeResponse putPdfInStorageToXls(name, outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, storage, password)

Converts PDF document (located on storage) to XLS format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xls) |
 **insertBlankColumnAtFirst** | **Boolean**| Insert blank column at first | [optional]
 **minimizeTheNumberOfWorksheets** | **Boolean**| Minimize the number of worksheets | [optional]
 **scaleFactor** | **Double**| Scale factor (Obsolete) | [optional]
 **uniformWorksheets** | **Boolean**| Uniform worksheets | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToXlsx"></a>
# **putPdfInStorageToXlsx**
> AsposeResponse putPdfInStorageToXlsx(name, outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, storage, password)

Converts PDF document (located on storage) to XLSX format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xlsx) |
 **insertBlankColumnAtFirst** | **Boolean**| Insert blank column at first | [optional]
 **minimizeTheNumberOfWorksheets** | **Boolean**| Minimize the number of worksheets | [optional]
 **scaleFactor** | **Double**| Scale factor (Obsolete) | [optional]
 **uniformWorksheets** | **Boolean**| Uniform worksheets | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToXml"></a>
# **putPdfInStorageToXml**
> AsposeResponse putPdfInStorageToXml(name, outPath, folder, storage)

Converts PDF document (located on storage) to XML format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xml) |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToXps"></a>
# **putPdfInStorageToXps**
> AsposeResponse putPdfInStorageToXps(name, outPath, folder, storage)

Converts PDF document (located on storage) to XPS format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xps) |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPolyLineAnnotation"></a>
# **putPolyLineAnnotation**
> PolyLineAnnotationResponse putPolyLineAnnotation(name, annotationId, annotation, storage, folder)

Replace document polyline annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**PolyLineAnnotation**](PolyLineAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PolyLineAnnotationResponse**](PolyLineAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPolygonAnnotation"></a>
# **putPolygonAnnotation**
> PolygonAnnotationResponse putPolygonAnnotation(name, annotationId, annotation, storage, folder)

Replace document polygon annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**PolygonAnnotation**](PolygonAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PolygonAnnotationResponse**](PolygonAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPopupAnnotation"></a>
# **putPopupAnnotation**
> PopupAnnotationResponse putPopupAnnotation(name, annotationId, annotation, storage, folder)

Replace document popup annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**PopupAnnotation**](PopupAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**PopupAnnotationResponse**](PopupAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPrivileges"></a>
# **putPrivileges**
> AsposeResponse putPrivileges(name, privileges, storage, folder)

Update privilege document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **privileges** | [**DocumentPrivilege**](DocumentPrivilege.md)| Document privileges. DocumentPrivilege |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPsInStorageToPdf"></a>
# **putPsInStorageToPdf**
> AsposeResponse putPsInStorageToPdf(name, srcPath, dstFolder, storage)

Convert PS file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.ps) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRadioButtonField"></a>
# **putRadioButtonField**
> RadioButtonFieldResponse putRadioButtonField(name, fieldName, field, storage, folder)

Replace document RadioButton field

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name. |
 **field** | [**RadioButtonField**](RadioButtonField.md)| The field. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**RadioButtonFieldResponse**](RadioButtonFieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRedactionAnnotation"></a>
# **putRedactionAnnotation**
> RedactionAnnotationResponse putRedactionAnnotation(name, annotationId, annotation, storage, folder, apply)

Replace document redaction annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**RedactionAnnotation**](RedactionAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **apply** | **Boolean**| Apply redaction immediately after adding. | [optional] [default to false]

### Return type

[**RedactionAnnotationResponse**](RedactionAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putReplaceImage"></a>
# **putReplaceImage**
> ImageResponse putReplaceImage(name, imageId, imageFilePath, storage, folder, image)

Replace document image.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| The image ID. |
 **imageFilePath** | **String**| Path to image file if specified. Request content is used otherwise. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **image** | [****](.md)| Image file. | [optional]

### Return type

[**ImageResponse**](ImageResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putReplaceMultipleImage"></a>
# **putReplaceMultipleImage**
> ImagesResponse putReplaceMultipleImage(name, imageIds, imageFilePath, storage, folder, image)

Replace document multiple image.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageIds** | **List&lt;String&gt;**| The image IDs. |
 **imageFilePath** | **String**| Path to image file if specified. Request content is used otherwise. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **image** | [****](.md)| Image file. | [optional]

### Return type

[**ImagesResponse**](ImagesResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putScreenAnnotation"></a>
# **putScreenAnnotation**
> ScreenAnnotationResponse putScreenAnnotation(name, annotationId, annotation, storage, folder)

Replace document screen annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**ScreenAnnotation**](ScreenAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ScreenAnnotationResponse**](ScreenAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putScreenAnnotationDataExtract"></a>
# **putScreenAnnotationDataExtract**
> AsposeResponse putScreenAnnotationDataExtract(name, annotationId, outFilePath, storage, folder)

Extract document screen annotation content to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **outFilePath** | **String**| The output file path. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSearchableDocument"></a>
# **putSearchableDocument**
> AsposeResponse putSearchableDocument(name, storage, folder, lang)

Create searchable PDF document. Generate OCR layer for images in input PDF document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **lang** | **String**| language for OCR engine. Possible values: eng, ara, bel, ben, bul, ces, dan, deu, ell, fin, fra, heb, hin, ind, isl, ita, jpn, kor, nld, nor, pol, por, ron, rus, spa, swe, tha, tur, ukr, vie, chi_sim, chi_tra or thier combination e.g. eng,rus  | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSetProperty"></a>
# **putSetProperty**
> DocumentPropertyResponse putSetProperty(name, propertyName, value, storage, folder, password)

Add/update document property.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **propertyName** | **String**| Property name. |
 **value** | **String**| Property value. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **password** | **String**| The password (Base64). | [optional]

### Return type

[**DocumentPropertyResponse**](DocumentPropertyResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSignatureField"></a>
# **putSignatureField**
> SignatureFieldResponse putSignatureField(name, fieldName, field, storage, folder)

Replace document signature field.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name. |
 **field** | [**SignatureField**](SignatureField.md)| The field. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SignatureFieldResponse**](SignatureFieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSoundAnnotation"></a>
# **putSoundAnnotation**
> SoundAnnotationResponse putSoundAnnotation(name, annotationId, annotation, storage, folder)

Replace document sound annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**SoundAnnotation**](SoundAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SoundAnnotationResponse**](SoundAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSoundAnnotationDataExtract"></a>
# **putSoundAnnotationDataExtract**
> AsposeResponse putSoundAnnotationDataExtract(name, annotationId, outFilePath, storage, folder)

Extract document sound annotation content to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **outFilePath** | **String**| The output file path. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSquareAnnotation"></a>
# **putSquareAnnotation**
> SquareAnnotationResponse putSquareAnnotation(name, annotationId, annotation, storage, folder)

Replace document square annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**SquareAnnotation**](SquareAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SquareAnnotationResponse**](SquareAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSquigglyAnnotation"></a>
# **putSquigglyAnnotation**
> SquigglyAnnotationResponse putSquigglyAnnotation(name, annotationId, annotation, storage, folder)

Replace document squiggly annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**SquigglyAnnotation**](SquigglyAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SquigglyAnnotationResponse**](SquigglyAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putStampAnnotation"></a>
# **putStampAnnotation**
> StampAnnotationResponse putStampAnnotation(name, annotationId, annotation, storage, folder)

Replace document stamp annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**StampAnnotation**](StampAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**StampAnnotationResponse**](StampAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putStampAnnotationDataExtract"></a>
# **putStampAnnotationDataExtract**
> AsposeResponse putStampAnnotationDataExtract(name, annotationId, outFilePath, storage, folder)

Extract document stamp annotation content to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **outFilePath** | **String**| The output file path. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putStrikeOutAnnotation"></a>
# **putStrikeOutAnnotation**
> StrikeOutAnnotationResponse putStrikeOutAnnotation(name, annotationId, annotation, storage, folder)

Replace document StrikeOut annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**StrikeOutAnnotation**](StrikeOutAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**StrikeOutAnnotationResponse**](StrikeOutAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSvgInStorageToPdf"></a>
# **putSvgInStorageToPdf**
> AsposeResponse putSvgInStorageToPdf(name, srcPath, adjustPageSize, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, dstFolder, storage)

Convert SVG file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.svg) |
 **adjustPageSize** | **Boolean**| Adjust page size | [optional]
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putTable"></a>
# **putTable**
> AsposeResponse putTable(name, tableId, table, storage, folder)

Replace document page table.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **tableId** | **String**| The table ID. |
 **table** | [**Table**](Table.md)| The table. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putTeXInStorageToPdf"></a>
# **putTeXInStorageToPdf**
> AsposeResponse putTeXInStorageToPdf(name, srcPath, dstFolder, storage)

Convert TeX file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.tex) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putTextAnnotation"></a>
# **putTextAnnotation**
> TextAnnotationResponse putTextAnnotation(name, annotationId, annotation, storage, folder)

Replace document text annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**TextAnnotation**](TextAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TextAnnotationResponse**](TextAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putTextBoxField"></a>
# **putTextBoxField**
> TextBoxFieldResponse putTextBoxField(name, fieldName, field, storage, folder)

Replace document text box field

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name. |
 **field** | [**TextBoxField**](TextBoxField.md)| The field. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TextBoxFieldResponse**](TextBoxFieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUnderlineAnnotation"></a>
# **putUnderlineAnnotation**
> UnderlineAnnotationResponse putUnderlineAnnotation(name, annotationId, annotation, storage, folder)

Replace document underline annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**UnderlineAnnotation**](UnderlineAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**UnderlineAnnotationResponse**](UnderlineAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUpdateField"></a>
# **putUpdateField**
> FieldResponse putUpdateField(name, fieldName, field, storage, folder)

Update field.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The name of a field to be updated. |
 **field** | [**Field**](Field.md)| Field with the field data. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FieldResponse**](FieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUpdateFields"></a>
# **putUpdateFields**
> FieldsResponse putUpdateFields(name, fields, storage, folder)

Update fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fields** | [**Fields**](Fields.md)| Fields with the fields data. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FieldsResponse**](FieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putWebInStorageToPdf"></a>
# **putWebInStorageToPdf**
> AsposeResponse putWebInStorageToPdf(name, url, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, dstFolder, storage)

Convert web page to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **url** | **String**| Source url |
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putXfaPdfInRequestToAcroForm"></a>
# **putXfaPdfInRequestToAcroForm**
> AsposeResponse putXfaPdfInRequestToAcroForm(outPath, storage, file)

Converts PDF document which contains XFA form (in request content) to PDF with AcroForm and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.pdf) |
 **storage** | **String**| The document storage. | [optional]
 **file** | **File**| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="putXfaPdfInStorageToAcroForm"></a>
# **putXfaPdfInStorageToAcroForm**
> AsposeResponse putXfaPdfInStorageToAcroForm(name, outPath, folder, storage)

Converts PDF document which contains XFA form (located on storage) to PDF with AcroForm and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.pdf) |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putXmlInStorageToPdf"></a>
# **putXmlInStorageToPdf**
> AsposeResponse putXmlInStorageToPdf(name, srcPath, xslFilePath, dstFolder, storage)

Convert XML file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xml) |
 **xslFilePath** | **String**| Full XSL source filename (ex. /folder1/folder2/template.xsl) | [optional]
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putXpsInStorageToPdf"></a>
# **putXpsInStorageToPdf**
> AsposeResponse putXpsInStorageToPdf(name, srcPath, dstFolder, storage)

Convert XPS file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xps) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putXslFoInStorageToPdf"></a>
# **putXslFoInStorageToPdf**
> AsposeResponse putXslFoInStorageToPdf(name, srcPath, dstFolder, storage)

Convert XslFo file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xpsfo) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="storageExists"></a>
# **storageExists**
> StorageExist storageExists(storageName)

Check if storage exists

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name |

### Return type

[**StorageExist**](StorageExist.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadFile"></a>
# **uploadFile**
> FilesUploadResult uploadFile(path, file, storageName)

Upload file

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.              |
 **file** | **File**| File to upload |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesUploadResult**](FilesUploadResult.md)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

