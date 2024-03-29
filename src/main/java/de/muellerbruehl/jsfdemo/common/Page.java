package de.muellerbruehl.jsfdemo.common;

import java.util.HashMap;
import java.util.Map;

public enum Page {
	  Home("/index"),
	  LabeledText("/component/labeledText"),
	  Validate("/component/validate"),
	  Bill("/table/bill")
	  ;

	  private Page(String url) {
	    _url = url;
	  }
	  private final String _url;

	  public String url() {
	    return _url + ".xhtml";
	  }

	  public String urlRedirect() {
	    return _url + ".xhtml?faces-redirect=true";
	  }

	  private static Map<String, String> pages;

	  public static Map<String, String> getPages() {
	    if (pages == null) {
	      pages = new HashMap<>();
	      for (Page page : Page.values()) {
	        pages.put(page.name(), page.url());
	      }
	    }
	    return pages;
	  }
	}

