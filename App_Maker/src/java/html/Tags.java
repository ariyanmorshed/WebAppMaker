package html;

public class Tags {
    
    public static String bootstrat(String tags) {
        String row = "<div class=\"row\">" + tags + "</div>";
        String container = "<div class=\"container\">" + row + "</div>";
        return container;
    }
    
    //Css link tag
    public static String cssHref(String href) {
        String section;
        String linkhref;
        if (href.length() != 0) {
            linkhref = " href=\""+href+"\"";
        } else{
           linkhref = "";
        } 
        section = "<link rel=\"stylesheet\""  + linkhref + ">";
        return section;
    }
    
    //Javascript link tag
    public static String scriptJs(String src) {
        String section;
        String linkSrc;
        if (src.length() != 0) {
            linkSrc = " src=\""+src+"\"";
        } else{
           linkSrc = "";
        } 
        section = "<script " + linkSrc + "></script>";
        return section;
    }
    
    //Html Tags start here
    public static String html(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<!DOCTYPE html><html class=\"no-js\" lang=\"en\">" + contents + "</html>";
        return section;
    }
    
    
    //head tag
    public static String head(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<head>" + contents + "</head>";
        return section;
    }
    
    
    //Body tag
    public static String body(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<dody>" + contents + "</dody>";
        return section;
    }
    
    //title tag
    public static String title(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<title>" + contents + "</title>";
        return section;
    }
    
    
    //Section tag
    public static String section(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<section>" + contents + "</section>";
        return section;
    }
    
    public static String section(String Class, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<section"+seclass+">" + contents + "</section>";
        return section;
    }
    
    public static String section(String Class, String Id, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<section"+seid+""+seclass+">" + contents + "</section>";
        return section;
    }
 
    public static String section(String Class, String Id,String properties, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (properties.length() != 0) {
            propers = " " + properties+ "";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<section"+seid+""+seclass+""+propers+">" + contents + "</section>";
        return section;
    }
    
    
    //Div tag
    public static String div(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<div>" + contents + "</div>";
        return section;
    }
    
    public static String div(String Class, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<div"+seclass+">" + contents + "</div>";
        return section;
    }

    public static String div(String Class, String Id, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<div"+seid+""+seclass+">" + contents + "</div>";
        return section;
    }
    
    public static String div(String Class, String Id,String properties, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (properties.length() != 0) {
            propers = " " + properties+ "";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<div"+seid+""+seclass+""+propers+">" + contents + "</div>";
        return section;
    }
    
    
    //h1 tag
    public static String h1(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h1>" + contents + "</h1>";
        return section;
    }
    
    public static String h1(String Class, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h1"+seclass+">" + contents + "</h1>";
        return section;
    }

    public static String h1(String Class, String Id, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h1"+seid+""+seclass+">" + contents + "</h1>";
        return section;
    }
    
    public static String h1(String Class, String Id,String properties, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (properties.length() != 0) {
            propers = " " + properties+ "";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h1"+seid+""+seclass+""+propers+">" + contents + "</h1>";
        return section;
    }
    
    
    //h2 tag
    public static String h2(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h2>" + contents + "</h2>";
        return section;
    }
    
    public static String h2(String Class, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h2"+seclass+">" + contents + "</h2>";
        return section;
    }

    public static String h2(String Class, String Id, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h2"+seid+""+seclass+">" + contents + "</h2>";
        return section;
    }
    
    public static String h2(String Class, String Id,String properties, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (properties.length() != 0) {
            propers = " " + properties+ "";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h2"+seid+""+seclass+""+propers+">" + contents + "</h2>";
        return section;
    }
    
    
    //h3 tag
    public static String h3(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h3>" + contents + "</h3>";
        return section;
    }
    
    public static String h3(String Class, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h3"+seclass+">" + contents + "</h3>";
        return section;
    }

    public static String h3(String Class, String Id, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h3"+seid+""+seclass+">" + contents + "</h3>";
        return section;
    }
    
    public static String h3(String Class, String Id,String properties, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (properties.length() != 0) {
            propers = " " + properties+ "";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h3"+seid+""+seclass+""+propers+">" + contents + "</h3>";
        return section;
    }
    
    
    //h4 tag
    public static String h4(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h4>" + contents + "</h4>";
        return section;
    }
    
    public static String h4(String Class, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h4"+seclass+">" + contents + "</h4>";
        return section;
    }

    public static String h4(String Class, String Id, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h4"+seid+""+seclass+">" + contents + "</h4>";
        return section;
    }
    
    public static String h4(String Class, String Id,String properties, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (properties.length() != 0) {
            propers = " " + properties+ "";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h4"+seid+""+seclass+""+propers+">" + contents + "</h4>";
        return section;
    }
    
    
    //h5 tag
    public static String h5(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h5>" + contents + "</h5>";
        return section;
    }
    
    public static String h5(String Class, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h5"+seclass+">" + contents + "</h5>";
        return section;
    }

    public static String h5(String Class, String Id, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h5"+seid+""+seclass+">" + contents + "</h5>";
        return section;
    }
    
    public static String h5(String Class, String Id,String properties, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (properties.length() != 0) {
            propers = " " + properties+ "";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h5"+seid+""+seclass+""+propers+">" + contents + "</h5>";
        return section;
    }
    
    
    //h6 tag
    public static String h6(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h6>" + contents + "</h6>";
        return section;
    }
    
    public static String h6(String Class, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h6"+seclass+">" + contents + "</h6>";
        return section;
    }

    public static String h6(String Class, String Id, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h6"+seid+""+seclass+">" + contents + "</h6>";
        return section;
    }
    
    public static String h6(String Class, String Id,String properties, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (properties.length() != 0) {
            propers = " " + properties+ "";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<h6"+seid+""+seclass+""+propers+">" + contents + "</h6>";
        return section;
    }
    
    
    //p tag
    public static String p(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<p>" + contents + "</p>";
        return section;
    }
    
    public static String p(String Class, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<p"+seclass+">" + contents + "</p>";
        return section;
    }

    public static String p(String Class, String Id, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<p"+seid+""+seclass+">" + contents + "</p>";
        return section;
    }
    
    public static String p(String Class, String Id,String properties, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (properties.length() != 0) {
            propers = " " + properties+ "";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<p"+seid+""+seclass+""+propers+">" + contents + "</p>";
        return section;
    }
    
    
    //span tag
    public static String span(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<span>" + contents + "</span>";
        return section;
    }
    
    public static String span(String Class, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<span"+seclass+">" + contents + "</span>";
        return section;
    }

    public static String span(String Class, String Id, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<span"+seid+""+seclass+">" + contents + "</span>";
        return section;
    }
    
    public static String span(String Class, String Id,String properties, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (properties.length() != 0) {
            propers = " " + properties+ "";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<span"+seid+""+seclass+""+propers+">" + contents + "</span>";
        return section;
    }
    
    
    //strong tag
    public static String strong(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<strong>" + contents + "</strong>";
        return section;
    }
    
    public static String strong(String Class, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<strong"+seclass+">" + contents + "</strong>";
        return section;
    }

    public static String strong(String Class, String Id, String tags) {
        String section;
        String seclass;
        String seid;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<strong"+seid+""+seclass+">" + contents + "</strong>";
        return section;
    }
    
    public static String strong(String Class, String Id,String properties, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (Class.length() != 0) {
            seclass = " class=\""+Class+"\"";
        } else{
           seclass = "";
        }  
        if (Id.length() != 0) {
            seid = " id=\"" + Id+ "\"";
        } else {
            seid = "";
        }
        if (properties.length() != 0) {
            propers = " " + properties+ "";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<strong"+seid+""+seclass+""+propers+">" + contents + "</strong>";
        return section;
    }
    
    
    
    //Form tag
    public static String form(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<form>" + contents + "</form>";
        return section;
    }
    
    public static String form(String linkAction, String tags) {
        String section;
        String selink;
        String seid;
        String contents;
        if (linkAction.length() != 0) {
            selink = " action=\""+linkAction+"\"";
        } else{
           selink = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<form"+selink+">" + contents + "</form>";
        return section;
    }

    public static String form(String linkAction, String method, String tags) {
        String section;
        String selink;
        String semethod;
        String contents;
        if (linkAction.length() != 0) {
            selink = " action=\""+linkAction+"\"";
        } else{
           selink = "";
        }  
        if (method.length() != 0) {
            semethod = " method=\"" + method+ "\"";
        } else {
            semethod = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<form"+semethod+""+selink+">" + contents + "</form>";
        return section;
    }
    
    
    
    //Input tag
    public static String input(String type) {
        String section;
        String seTypes;
        if (type.length() != 0) {
            seTypes = " type=\""+type+"\"";
        } else{
           seTypes = "";
        }
        section = "<input"+seTypes+">";
        return section;
    }
    
    public static String input(String type, String tags) {
        String section;
        String seTypes;
        String contents;
        if (type.length() != 0) {
            seTypes = " type=\""+type+"\"";
        } else{
           seTypes = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<input"+seTypes+">" + contents ;
        return section;
    }

    public static String input(String type, String id, String tags) {
        String section;
        String selink;
        String semethod;
        String contents;
        if (type.length() != 0) {
            selink = " type=\""+type+"\"";
        } else{
           selink = "";
        }  
        if (id.length() != 0) {
            semethod = " id=\"" + id+ "\"";
        } else {
            semethod = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<input"+semethod+""+selink+">" + contents ;
        return section;
    }
    
    public static String input(String type, String id,String Class, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (type.length() != 0) {
            seclass = " type=\""+type+"\"";
        } else{
           seclass = "";
        }  
        if (id.length() != 0) {
            seid = " id=\"" + id+ "\"";
        } else {
            seid = "";
        }
        if (Class.length() != 0) {
            propers = " class=\"" + Class+ "\"";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<input"+seid+""+seclass+""+propers+">" + contents;
        return section;
    }
    
    public static String input(String type, String id,String Class, String name, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        String sename;
        if (type.length() != 0) {
            seclass = " type=\""+type+"\"";
        } else{
           seclass = "";
        }  
        if (id.length() != 0) {
            seid = " id=\"" + id+ "\"";
        } else {
            seid = "";
        }
        if (Class.length() != 0) {
            propers = " class=\"" + Class+ "\"";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        }
        if (name.length() != 0) {
            sename = " name=\"" + name+ "\"";
        } else {
            sename = "";
        }
        section = "<input"+seid+""+seclass+""+propers+""+sename+">" + contents;
        return section;
    }
    
    
    
    
    //Button tag
    public static String button(String tags) {
        String section;
        String seid;
        String contents;
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<button>" + contents + "</button>";
        return section;
    }
    
    public static String button(String type, String tags) {
        String section;
        String selink;
        String seid;
        String contents;
        if (type.length() != 0) {
            selink = " type=\""+type+"\"";
        } else{
           selink = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<button"+selink+">" + contents + "</button>";
        return section;
    }

    public static String button(String type, String id, String tags) {
        String section;
        String selink;
        String semethod;
        String contents;
        if (type.length() != 0) {
            selink = " type=\""+type+"\"";
        } else{
           selink = "";
        }  
        if (id.length() != 0) {
            semethod = " id=\"" + id+ "\"";
        } else {
            semethod = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<button"+semethod+""+selink+">" + contents + "</button>";
        return section;
    }
    
    public static String button(String type, String id,String propertis, String tags) {
        String section;
        String seclass;
        String seid;
        String propers;
        String contents;
        if (type.length() != 0) {
            seclass = " type=\""+type+"\"";
        } else{
           seclass = "";
        }  
        if (id.length() != 0) {
            seid = " id=\"" + id+ "\"";
        } else {
            seid = "";
        }
        if (propertis.length() != 0) {
            propers = " " + propertis+ "\"";
        } else {
            propers = "";
        }
        if (tags.length() != 0) {
            contents = ""+tags+"";
        } else{
           contents = "";
        } 
        section = "<button"+seid+""+seclass+""+propers+">" + contents + "</button>";
        return section;
    }
       
}

