/*
 * eGov Water and Sewerage(W&S)  System.
 * APIs for W&S module. This provide APIs for create new property, update existing property, search existing property. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.math.BigDecimal;
import io.swagger.client.model.ErrorRes;
import io.swagger.client.model.RequestInfo;
import io.swagger.client.model.ResponseInfo;
import io.swagger.client.model.SewerageConnectionRequest;
import io.swagger.client.model.SewerageConnectionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SewerageApi
 */
@Ignore
public class SewerageApiTest {

    private final SewerageApi api = new SewerageApi();

    /**
     * Deactivate existing water connection.
     *
     * Deactivate existing water connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void swcCancelPostTest() throws ApiException {
        RequestInfo body = null;
        String tenantId = null;
        String connectionNo = null;
        ResponseInfo response = api.swcCancelPost(body, tenantId, connectionNo);

        // TODO: test validations
    }
    /**
     * Apply for new Sewerage connection.
     *
     * Citizen or employee can apply for new Sewerage connection. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void swcCreatePostTest() throws ApiException {
        SewerageConnectionRequest body = null;
        SewerageConnectionResponse response = api.swcCreatePost(body);

        // TODO: test validations
    }
    /**
     * Delete existing Sewerage connection.
     *
     * Delete existing Sewerage connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void swcDeletePostTest() throws ApiException {
        RequestInfo body = null;
        String tenantId = null;
        String connectionNo = null;
        ResponseInfo response = api.swcDeletePost(body, tenantId, connectionNo);

        // TODO: test validations
    }
    /**
     * Get the list of exsting Sewerage connections.
     *
     * Get the water connections list based on the input parameters. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void swcSearchPostTest() throws ApiException {
        RequestInfo body = null;
        String tenantId = null;
        List<String> ids = null;
        List<String> connectionNo = null;
        List<String> oldConnectionNo = null;
        Long mobileNumber = null;
        BigDecimal fromDate = null;
        BigDecimal toDate = null;
        SewerageConnectionResponse response = api.swcSearchPost(body, tenantId, ids, connectionNo, oldConnectionNo, mobileNumber, fromDate, toDate);

        // TODO: test validations
    }
    /**
     * Update existing Sewerage connection details.
     *
     * Updates a given &#x60;Sewerage connection&#x60; with newer details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void swcUpdatePostTest() throws ApiException {
        SewerageConnectionRequest body = null;
        SewerageConnectionResponse response = api.swcUpdatePost(body);

        // TODO: test validations
    }
}
