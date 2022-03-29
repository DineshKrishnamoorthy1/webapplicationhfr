package com.example.application.views.MyAsset;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@CssImport(value = "./styles/myassets.css")
@Route("myasset")
public class MyAsset extends Div {
    public MyAsset() {
        add(SearchBar());
        add(Dettials());
        add(Invoices());
    }
    private Component SearchBar()
    {
        HorizontalLayout HlayoutofSearch=new HorizontalLayout();
        HlayoutofSearch.setPadding(true);
        HlayoutofSearch.setSpacing(true);
       // Button sort=new Button("Sort");
        Icon sort=new Icon(VaadinIcon.SORT);
        Icon filter=new Icon(VaadinIcon.FILTER);
        TextField textField=new TextField();
        textField.setPlaceholder("Search Bar");
        textField.setWidth("750px");
       // Button filter=new Button("filter");
        FlexComponent.JustifyContentMode mode= FlexComponent.JustifyContentMode.BETWEEN;
        HlayoutofSearch.setJustifyContentMode(mode);
        HlayoutofSearch.add(textField);
        HlayoutofSearch.add(sort);
        HlayoutofSearch.add(filter);
        HlayoutofSearch.addClassName("searchcard");
        return HlayoutofSearch;
    }
    private Component Dettials()
    {
HorizontalLayout CredentialsDiv=new HorizontalLayout();
CredentialsDiv.setPadding(true);
CredentialsDiv.setSpacing(true);
        FlexComponent.JustifyContentMode mode= FlexComponent.JustifyContentMode.EVENLY;
        CredentialsDiv.setJustifyContentMode(mode);
        CredentialsDiv.setAlignItems(FlexComponent.Alignment.STRETCH);
CredentialsDiv.addClassName("searchcard");

        Div filled=new Div();
        Label callable=new Label("File 50");
        callable.setWidth("80px");
        callable.addClassName("searchcard");
        filled.add(callable);

        Div widdiv=new Div();
        Label widlable=new Label("WID 50");
        widlable.addClassName("searchcard");
        widdiv.add(widlable);

        Div avgsizediv=new Div();
        Label avgsizelable=new Label("Avg.Size: 10MB");
        avgsizelable.addClassName("searchcard");
        avgsizediv.add(avgsizelable);

        Div avgpagediv=new Div();
        Label avgpagelable=new Label("Avg.Page :30");
        avgpagelable.addClassName("searchcard");
        avgpagediv.add(avgpagelable);



        CredentialsDiv.add(filled,widdiv,avgsizediv,avgpagediv);


        return CredentialsDiv;
    }
    private Component Invoices()
    {
        HorizontalLayout invoice=new HorizontalLayout();
        FlexComponent.JustifyContentMode mode= FlexComponent.JustifyContentMode.CENTER;
        invoice.setJustifyContentMode(mode);
        invoice.setAlignItems(FlexComponent.Alignment.STRETCH);
      //  invoice.addClassName("searchcard");
        invoice.setSpacing(true);
        invoice.setPadding(true);


        Div example=new Div();
        VerticalLayout verticalLayout=new VerticalLayout();
        verticalLayout.setPadding(true);
        verticalLayout.setSpacing(true);
        verticalLayout.add(example);
        Button button=new Button("Example");
        button.setHeight("400px");
        button.setWidth("300px");
        button.addClassName("searchcard");
        example.add(button);


        Div example2=new Div();
        VerticalLayout verticalLayout1=new VerticalLayout();
        verticalLayout1.setPadding(true);
        verticalLayout1.setSpacing(true);
        example.addClassName("div1");
        invoice.add(example2);
        Button button1=new Button("Example1");
        button1.setHeight("400px");
        button1.setWidth("300px");
        button1.addClassName("searchcard");
        example2.add(button1);


        Div example3=new Div();
        Button button2=new Button("Example2");
        button2.setHeight("400px");
        button2.setWidth("300px");
        button2.addClassName("searchcard");
        example3.add(button2);

        invoice.setAlignItems(FlexComponent.Alignment.CENTER);
        invoice.add(example,example2,example3);


        return invoice;
    }
}
