package com.wipro.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Log")
public class Log {

    private long LogId;
    private String Request;
    private String Response;
    private String Exception;
    private String Url;
    private Date RequestDate;
    private Date ResponseDate;
    
    public Log() {
  
    }
 
    public Log(String Request, String Response, String Exception, Date RequestDate, Date ResponseDate) {
         this.Request = Request;
         this.Response = Response;
         this.Exception = Exception;
         this.RequestDate = RequestDate;
         this.ResponseDate = ResponseDate;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        public long getId() {
        return LogId;
    }
    public void setLogId(long LogId) {
        this.LogId = LogId;
    }
 
    @Column(name = "Request", nullable = false)
    public String getRequest() {
        return Request;
    }
    public void setRequest(String Request) {
        this.Request = Request;
    }
 
    @Column(name = "Response", nullable = false)
    public String getResponse() {
        return Response;
    }
    public void setResponse(String Response) {
        this.Response = Response;
    }
 
    @Column(name = "Exception", nullable = false)
    public String getException() {
        return Exception;
    }
    public void setException(String Exception) {
        this.Exception = Exception;
    }
    
    @Column(name = "Url", nullable = false)
    public String getUrl() {
        return Url;
    }
    public void setUrl(String Url) {
        this.Url = Url;
    }

    @Column(name = "RequestDate", nullable = false)
    public Date getRequestDate() {
        return RequestDate;
    }
    public void setRequestDate(Date RequestDate) {
        this.RequestDate = RequestDate;
    }
    
    @Column(name = "ResponseDate", nullable = false)
    public Date getResponseDate() {
        return ResponseDate;
    }
    public void setResponseDate(Date ResponseDate) {
        this.ResponseDate = ResponseDate;
    }
 
}