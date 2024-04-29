package miu.cs489.ads.dto.request;

import lombok.Data;

@Data
public class AddressRequest {
        private String city;
        private String state;
        private String zipCode;

}
