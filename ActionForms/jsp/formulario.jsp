<%@ taglib uri="/tags/struts-html" prefix="html" %>

    <%-- Este formulario se enviará a la acción "ingresoDatos" --%>

        <html:form action="ingresoDatos">

            Nombre:
            <html:text property="nombre" />

            <%-- El mensaje de error si algo falla respecto al nombre --%>
                <b>
                    <html:errors property="nombre" />
                </b>
                <br />

                Edad:
                <html:text property="edad" />

                <%-- El mensaje de error si algo falla respecto a la edad --%>
                    <b>
                        <html:errors property="edad" />
                    </b>
                    <br />

                    Fumador:
                    <html:checkbox property="fumador" />

                    <%-- El mensaje de error si algo falla respecto a la condición de fumador --%>
                        <b>
                            <html:errors property="fumador" />
                        </b>
                        <br />

                        <br />
                        <html:submit value="Enviar" />

        </html:form>