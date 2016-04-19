package com.salats.service;

import com.salats.utils.Tariff;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * Created by paradise on 19.04.16.
 */
public interface ProviderResponseParser {

    List<Tariff> parse(HttpServletRequest request) throws IOException;

}
