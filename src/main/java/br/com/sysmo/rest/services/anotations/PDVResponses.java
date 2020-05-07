package br.com.sysmo.rest.services.anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@ApiResponses(value = {

        @ApiResponse(code = 200, message = "Registro encontrado."), @ApiResponse(code = 204, message = "Nenhum registro encontrado."),
        @ApiResponse(code = 400, message = "Requisição falha (bad request)."), @ApiResponse(code = 401, message = "Sem permissão (Unauthorized)."),
        @ApiResponse(code = 403, message = "Proibido (Forbidden)."), @ApiResponse(code = 404, message = "Não encontrado (Not Found)."),
        @ApiResponse(code = 500, message = "Erro interno (Internal Server Error).")

})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PDVResponses {

}
