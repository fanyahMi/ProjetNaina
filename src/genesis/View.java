package genesis;

public class View {

    private String viewName;
    private String viewContent;
    private String viewSavePath;
    private String viewExtension;
    private String viewTableContent;
    private String viewComponentSavePath;
    private String viewImportService;
    private String viewTableLine;
    private String tableName;
    private String viewExportComponentName;
    private String viewExportComponentExtension;
    private String viewExportComponentContent;
    private String viewExportComponentSavePath;
    private String viewExportComponentImport;

    /***** Service () ***/
    private Service service;
    private Route routes;
    private Sidebar sidebar;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Route getRoutes() {
        return routes;
    }

    public void setRoutes(Route routes) {
        this.routes = routes;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Sidebar getSidebar() {
        return sidebar;
    }

    public void setSidebar(Sidebar sidebar) {
        this.sidebar = sidebar;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public String getViewContent() {
        return viewContent;
    }

    public String getViewTableContent() {
        return viewTableContent;
    }

    public void setViewTableContent(String viewTableContent) {
        this.viewTableContent = viewTableContent;
    }

    public String getViewComponentSavePath() {
        return viewComponentSavePath;
    }

    public void setViewComponentSavePath(String viewComponentSavePath) {
        this.viewComponentSavePath = viewComponentSavePath;
    }

    public void setViewContent(String viewContent) {
        this.viewContent = viewContent;
    }

    public String getViewSavePath() {
        return viewSavePath;
    }

    public void setViewSavePath(String viewSavePath) {
        this.viewSavePath = viewSavePath;
    }

    public String getViewExtension() {
        return viewExtension;
    }

    public void setViewExtension(String viewExtension) {
        this.viewExtension = viewExtension;
    }

    public String getViewImportService() {
        return viewImportService;
    }

    public void setViewImportService(String viewImportService) {
        this.viewImportService = viewImportService;
    }

    public String getViewTableLine() {
        return viewTableLine;
    }

    public void setViewTableLine(String viewTableLine) {
        this.viewTableLine = viewTableLine;
    }

    public String getViewExportComponentName() {
        return viewExportComponentName;
    }

    public void setViewExportComponentName(String viewExportComponentName) {
        this.viewExportComponentName = viewExportComponentName;
    }

    public String getViewExportComponentExtension() {
        return viewExportComponentExtension;
    }

    public void setViewExportComponentExtension(String viewExportComponentExtension) {
        this.viewExportComponentExtension = viewExportComponentExtension;
    }

    public String getViewExportComponentContent() {
        return viewExportComponentContent;
    }

    public void setViewExportComponentContent(String viewExportComponentContent) {
        this.viewExportComponentContent = viewExportComponentContent;
    }

    public String getViewExportComponentSavePath() {
        return viewExportComponentSavePath;
    }

    public void setViewExportComponentSavePath(String viewExportComponentSavePath) {
        this.viewExportComponentSavePath = viewExportComponentSavePath;
    }

    public String getViewExportComponentImport() {
        return viewExportComponentImport;
    }

    public void setViewExportComponentImport(String viewExportComponentImport) {
        this.viewExportComponentImport = viewExportComponentImport;
    }

}
