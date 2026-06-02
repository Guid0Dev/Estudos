package br.com.dio.service;

import br.com.dio.dao.BasicBasketDAO;
import java.math.BigDecimal;
import static java.math.RoundingMode.CEILING;

public class BasicBasketService{

    private final BasicBasketDAO dao;
    public void receive(final Box box){
        this.dao = dao;
    }

    public void receive(final Box box){
        var unitAmount = box.unitAmount();
    }
}