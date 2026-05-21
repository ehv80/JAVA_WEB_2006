<!-- Declaramos el uso del paquete de tags HTML -->
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

    <html:html xhtml="true">

        <!-- Foco en el campo edad -->
        <html:form action="/procesarFormulario" focus="edad">
            <!-- Un campo con estilo que cambia al haber un error -->
            Nombre:
            <html:text property="nombre" errorStyle="font-family:Verdana;font-size:12px;"
                style="font-family:Verdana;font-size:12px;background-color:#FFFF00;color:#FF0000" />
            <br />
            <!-- Un campo acotado en tamaño -->
            Edad:
            <html:text property="edad" size="3" maxlength="3" />
            <br />
            <!-- Un campo deshabilitado -->
            Campo deshabilitado:
            <html:text property="deshabilitado" disabled="true" />
            <br />
            <!-- Un campo de solo lectura y con valor por defecto -->
            Campo de s&oacute;lo lectura:
            <html:text property="readonly" readonly="true" value="No soy modificable" />
            <br />
            <!-- Un botón de envío -->
            <html:submit value="Enviar" />
        </html:form>
    </html:html>