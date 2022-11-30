package in.ashokit.response;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.response.binding.Quotation;

@Service
public class QuoteClient
{
	public Quotation getResponseInObject()
	{
		RestTemplate rt = new RestTemplate();
		String url = "https://quoters.apps.pcfone.io/api/random";
		ResponseEntity<Quotation> forEntity = rt.getForEntity(url,Quotation.class);
		Quotation body = forEntity.getBody();
		return body;
	}

}
