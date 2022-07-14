package bai1.service;

import org.springframework.stereotype.Service;

@Service
public class ConvertingServiceImpl implements IConvertingService{

    @Override
    public double calculate(double usd) {
        return usd * 23000;
    }
}
