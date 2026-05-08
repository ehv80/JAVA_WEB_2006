//package Actions.WEB-INF.src;

import java.io.File;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DownloadAction;

public class DownloadCustomAction extends DownloadAction {
    @Override
    protected StreamInfo getStreamInfo(ActionMapping map, ActionForm form, HttpServletRequest req,
            HttpServletResponse res) throws Exception {
        // String content = "Este es un archivo de texto generado dinámicamente.";
        // InputStream inputStream = new
        // ByteArrayInputStream(content.getBytes("UTF-8"));
        // return new InputStreamStreamInfo("text/plain", inputStream, "archivo.txt");

        // Una clase interna que implemente la interfaz
        return new StreamInfo() {
            @Override
            public String getContentType() {
                return "text/plain";
            }

            @Override
            public InputStream getInputStream() throws IOException {
                String texto = "Texto a devolver";
                // String content = "Este es un archivo de texto generado dinámicamente.";
                return new ByteArrayInputStream(texto.getBytes());
            }

            // @Override
            // public String getFileName() {
            // return "archivo.txt";
            // }
        };
    }

    // Este archivo es pequeño, no necesitamos un buffer grande
    // protected int getBufferSize() {
    // return 1024;
    // }

}
