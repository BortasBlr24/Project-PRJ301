/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dal.BrandDAO;
import dal.ProductDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import model.Brand;
import model.Product;

/**
 *
 * @author admin
 */
public class CustomerController extends HttpServlet {

    private final String MAIN_URL = "index.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String service = req.getParameter("service");

        ArrayList<Brand> brands = (new BrandDAO()).getAll();

        if (service == null) {
            service = "listAll";
        }

        if (service.equals("listAll")) {
            ArrayList<Product> products = (new ProductDAO()).getAll();

            req.setAttribute("brands", brands);
            req.setAttribute("products", products);
            req.getRequestDispatcher(MAIN_URL).forward(req, resp);
        }

        if (service.equals("search")) {
            String keyword = req.getParameter("keyword");
            ArrayList<Product> products = (new ProductDAO()).getProductsByKeywords(keyword);

            req.setAttribute("brands", brands);
            req.setAttribute("products", products);
            req.getRequestDispatcher(MAIN_URL).forward(req, resp);
        }

        if (service.equals("filter-brand")) {
            int brandId = Integer.parseInt(req.getParameter("brand-id"));
            ArrayList<Product> products = (new ProductDAO()).getProductsByBrand(brandId);

            req.setAttribute("brands", brands);
            req.setAttribute("products", products);
            req.getRequestDispatcher(MAIN_URL).forward(req, resp);
        }
    }

}
