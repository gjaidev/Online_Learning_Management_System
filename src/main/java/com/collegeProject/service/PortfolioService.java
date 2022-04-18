package com.collegeProject.service;

import com.collegeProject.model.Portfolio;
import com.collegeProject.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {
    @Autowired
    private PortfolioRepository repository;

    public Portfolio savePortfolio(Portfolio portfolio){
       return repository.save(portfolio);
    }

    public List<Portfolio> savePortfolio(List<Portfolio> portfolios){
        return repository.saveAll(portfolios);
    }

    public List<Portfolio> getPortfolio(){
        return repository.findAll();
    }

    public Portfolio getPortfolioById(int portfolio_id){
        return repository.findById(portfolio_id).orElse(null);
    }

    public String deletePortfolio(int portfolio_id){
         repository.deleteById(portfolio_id);
        return "Portfolio deleted";
    }

    public Portfolio updatePortfolio(Portfolio portfolio){
        Portfolio existingPortfolio = repository.findById(portfolio.getPortfolio_id()).orElse(null);
        existingPortfolio.setPortfolio_description(portfolio.getPortfolio_description());
        existingPortfolio.setPortfolio_name(portfolio.getPortfolio_name());
        existingPortfolio.setStudent_id(portfolio.getStudent_id());
        return repository.save(existingPortfolio);
    }
}
