package com.example.idms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class AccountService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final AccountRepository accountRepository;
    
    @Autowired
    public AccountService(AccountRepository AccountRepository) {
        this.accountRepository = AccountRepository;
    }

    public void fetchDataAndSave() {
        String token = getAuthorizationToken();
        
        String apiUrl = "https://idms.dealersocket.com/GetAccountList";
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(apiUrl)
                .queryParam("page", 1) // Assuming we start at page 1
                .queryParam("layoutID", 2006084)
                .queryParam("accountStatus", "a")
                .queryParam("institutionID", 107007);
        
        Account[] accounts = restTemplate.getForObject(uriBuilder.toUriString(), Account[].class);
        
        for (Account account : accounts) {
            if (!accountRepository.existsByAcctID(account.getAcctID())) {
                Account Account = new Account();
                Account.setAcctID(account.getAcctID());
                Account.setContractSalesPrice(account.getContractSalesPrice());
                Account.setAcctType(account.getAcctType());
                Account.setSalesGroupPerson1ID(account.getSalesGroupPerson1ID());
                Account.setContractDate(account.getContractDate());
                Account.setCollateralStockNumber(account.getCollateralStockNumber());
                Account.setCollateralYearModel(account.getCollateralYearModel());
                Account.setCollateralMake(account.getCollateralMake());
                Account.setCollateralModel(account.getCollateralModel());
                Account.setBorrower1FirstName(account.getBorrower1FirstName());
                Account.setBorrower1LastName(account.getBorrower1LastName());

                accountRepository.save(Account);
            }
        }
    }

    private String getAuthorizationToken() {
        String authUrl = "https://idms.dealersocket.com/GetUserAuthorizationToken";
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(authUrl)
                .queryParam("username", "testerAPI@drivesoft.tech")
                .queryParam("password", "GiclVIaDRAT8^7st@@M90ain");

        AuthTokenResponse tokenResponse = restTemplate.getForObject(uriBuilder.toUriString(), AuthTokenResponse.class);
        return tokenResponse.getToken();
    }
}
