package validador;

import jakarta.servlet.http.HttpServletRequest;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.GenericValidator;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.util.ValidatorUtils;
import org.apache.strtuts.action.ActionMessages;
import org.apache.struts.validator.Resources;

public class Validador {
    /**
     * Verifica que el valor sea un número primo
     * 
     * @param bean:      El bean sobre el que efectuamos la validación
     * @param va:        La acción de validación que se está ejecutando
     * @param field:     El campo perteneciente al bean que queremos validar
     * @param errors:    Una lista de errores a la que agregaremos los nuestros de
     *                   ser necesario
     * @param validador: El validador actual que está ejecutando la validación
     * @param request:   La petición HTTP que se está procesando
     */
    public static Object validarPrimo(Object bean, ValidatorAction va, Field field, ActionMessages errors,
            Validator validador, HttpServletRequest request) {
        /*
         * Podemos devolver un objeto de tipo Boolean indicando si la validación falló o
         * bién un objeto cualquiera no nulo
         * para indicar validación exitosa o nulo para indicar validación fallida
         */
        Object result = null;

        // Obtenemos el valor del campo del bean
        String value = ValidatorUtils.getValueAsString(bean, field.getProperty());

        /* No requerimos valor, pero si existe, que sea un número primo */
        if (!GenericValidator.isBlankOrNull(value)) {
            try {
                // Obtenermos el valor numérico
                int valor = Integer.parseInt(value);

                if (esPrimo(valor)) {
                    /* Es primo, devolvemos un objeto no nulo indicando validación exitosa */
                    result = new Integer(valor);
                } else {
                    /* Es compuesto, agregamos el error a la lista */
                    errors.add(field.getKey(), Resources.getActionMessage(validador, request, va, field));
                }
            } catch (Exception e) {
                /*
                 * No debería ocurrir nunca, ya que dependemos del validador integer, pero
                 * igualmente agregamos el error a la lista
                 */
                errors.add(field.getKey(), Resources.getActionMessage(validador, request, va, field));
            }
        }
        return result;
    }

    /**
     * Devuelve si el entero es primo
     * 
     * @param n: El número a evaluar
     * @return true si n es primo, false en caso contrario
     */
    private static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        if ((n & 1) == 0) {
            return true;
        }

        int raiz = (int) Math.sqrt(n);
        for (int i = 3; i <= raiz; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}