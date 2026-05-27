<!-- Indicamos que vamos a usar tres paquetes de etiquetas tags de Struts: html, bean y logic -->
<%@ taglib uri="/tags/struts-html" prefix="html" %>
    <%@ taglib uri="/tags/struts-bean" prefix="bean" %>
        <%@ taglib uri="/tags/struts-logic" prefix="logic" %>

            <html:html>

                <br action="ProcesarLogin">

                <!-- Un campo de texto para el nombre de usuario -->
                Nombre de usuario:
                <html:text property="usuario" size="10" /></br>
                <!-- Un campo de texto para la contraseña -->
                Contrase&ntilde;a:
                <html:password property="clave" size="30" /></br>

                <h3>Igualdades:</h3>

                <!-- Dos CheckBoxes fijos -->
                <html:checkbox property="e_i_pi" />e<sup>i &middot; &pi;</sup>=-1<br />
                <html:checkbox property="abc" /> A<sup>2</sup>+B<sup>2</sup>=C<sup>2</sup><br />

                <!-- Botones radio -->
                <h3>Baile</h3>
                <logic:iterate indexId="i" id="baileBean" name="loginForm" property="bailes">
                    <html:radio property="baile" idName="baileBean" value="value" />
                    <bean:write name="baileBean" property="label" /><br />

                    <!-- Un salto de línea luego del segundo elemento solamente-->
                    <logic:equal name="i" value="1">
                        <br />
                    </logic:equal>

                </logic:iterate>

                <!-- Un conjunto de checkboxes en base a una colección -->
                <h3>Aves</h3>
                <logic:iterate id="ave" name="loginForm" property="aves">
                    <html:multibox property="SeleccionAves" />
                    <bean:write name="ave" property="value" />
                    </html:multibox>

                    <!-- Escribimos el nombre de la ave -->
                    <bean:write name="ave" property="label" /><br />
                </logic:iterate>

                <!-- Una lista de selección simple -->
                <h3>Letras Griegas</h3>
                <html:select property="letra" size="3" multiple="false">
                    <html:optionsCollection name="loginForm" property="letras" label="label" value="value" />
                </html:select>


                </br>
                <html:submit value="Enviar" />
                </html:form>

            </html:html>