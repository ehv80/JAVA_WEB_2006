<!-- Importamos clases -->
<%@ page import="java.util.*, Vista.src.Pais" %>

    <%@ taglib uri="/tags/struts-html" prefix="html" %>

        <% //Una colección de países Collection paises=new Vector(); paises.add(new Pais("bo", "Bolivia" ));
            paises.add(new Pais("co", "Colombia" )); paises.add(new Pais("cl", "Chile" )); paises.add(new
            Pais("pe", "Perú" )); paises.add(new Pais("py", "Paraguay" )); paises.add(new Pais("ve", "Venezuela" ));
            paises.add(new Pais("uy", "Uruguay" )); pageContext.setAttribute("paises", paises, PageContext.PAGE_SCOPE);
            //Una colección de códigos Collection codigos=new Vector(); codigos.add("ec"); codigos.add("br");
            codigos.add("mx"); codigos.add("bb"); /* Este código será etiqueta también */
            pageContext.setAttribute("codigos", codigos, PageContext.PAGE_SCOPE); //Una colección de nombres Collection
            nombres=new Vector(); nombres.add("Ecuador"); nombres.add("Brasil"); nombres.add("México");
            pageContext.setAttribute("nombres", nombres, PageContext.PAGE_SCOPE); %>
            <html:html xhtml="true">
                <html:form action="procesarFormulario">
                    <!-- Una Lista de elementos, mostramos 4 items por vez y es una lista de selección simple -->
                    <html:select property="pepe" size="4" multiple="false">

                        <!-- Primera opción fija -->
                        <html:option value="ar">Argentina</html:option>

                        <!-- Accedemos a distintas colecciones para obtener valores y etiquetas -->
                        <html:options name="codigos" labelName="nombres" />

                        <!-- Accedemos a una colección de beans, y especificamos las propiedades para obtener el valor y la etiqueta de cada elemento -->
                        <html:optionsCollection name="paises" label="nombre" value="codigo" />
                    </html:select>

                </html:form>
            </html:html>