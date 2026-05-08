//package Actions.WEB-INF.src;

import java.io.File;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DownloadAction;

public class DownloadResourceAction extends DownloadAction {

    @Override
    protected StreamInfo getStreamInfo(ActionMapping map, ActionForm form, HttpServletRequest req,
            HttpServletResponse res) throws Exception {
        // String filePath = request.getParameter("filePath");
        // File file = new File(filePath);
        // if (!file.exists() || !file.isFile()) {
        // throw new Exception("File not found: " + filePath);
        // }
        return new ResourceStreamInfo("application/pdf", getServlet().getServletContext(),
                "C:/Users/ehv80/Desktop/mapreduce.pdf");
    }

    // Este archivo es grande, agrandamos el buffer
    protected int getBufferSize() {
        return 8192;
    }
}
