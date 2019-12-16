package RegressionTestPackage.RegComponent1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class GenerateVETBuzRuleXML{
	//static String VETResourceFolderPath="c:";
	static String ExcelFilePath = "C:\\Data\\data.xlsx";
	static String BizRuleSheet = "BizRuleSheet";
	 String FileName="c:\\Data\\VetBizruleValidFileBase.xml";
	 String VETBizRuleFiles="c:\\Data\\VETBizRuleFiles";
	
	 @Test
 	 public void VETBizRule() throws EncryptedDocumentException, InvalidFormatException, IOException {
		  CreateBizRuleMessageFiles();
		
	}
	
	public void DeleteExistingVETBizRuleFiles(String Dir) {
		File dir = new File(Dir);    
		for (File file: dir.listFiles())
		        file.delete();
	}
	
	private void CreateBizRuleMessageFiles() throws EncryptedDocumentException, InvalidFormatException, IOException {
		//Opening the Data.xlsx
		String CreateFileFlag=null;
		String xmlTagColumn=null;
		
		//deleting all existing files
		DeleteExistingVETBizRuleFiles(VETBizRuleFiles);
		
				//ExcelReadin
					InputStream inp = new FileInputStream(ExcelFilePath); 
				    	Workbook wb = WorkbookFactory.create(inp);
				    
				    //Navigating to mainsheet
				    Sheet sheet = wb.getSheet(BizRuleSheet);
				    
						  for(int j=1;j<sheet.getLastRowNum()+1;j++){
					    	 
							  try{CreateFileFlag=sheet.getRow(j).getCell(0).toString();}catch(Exception e) {CreateFileFlag="N";}//Reading the Flag for creating file
					    	 	
					    	 		if(CreateFileFlag.equals("Y")) {
					    	 			try{xmlTagColumn=sheet.getRow(j).getCell(11).toString();
					    	 					System.out.println(xmlTagColumn.length());
					    	 			}catch(Exception e) {xmlTagColumn="";}   //Reading the excel for the Tags and values which need to be modified
					    	 			//xmlTagColumn!=null || 
					    	 				 if(xmlTagColumn.length()>0){
					    	 					String fileName=sheet.getRow(j).getCell(13).toString();//filename and batch number
					    	 					 if(fileName.equalsIgnoreCase("E0307_P_VETADR_A_R181601"))	
					    	 						 System.out.println(fileName);
					    	 						String BizRuleXMLFileContent = ReadXMLTemplate(FileName);		//String newXmlFileContent=modifyXML(xmlTagColumn1,Value,fileName);
					    	 								BizRuleXMLFileContent=CreateNewBizRuleFileXMLContent(BizRuleXMLFileContent,xmlTagColumn);	//Modify the xml
					    	 									  
					    	 										BizRuleXMLFileContent=ChangeBatchNumber(BizRuleXMLFileContent,fileName);//Changing the batchnumber in xml
					    	 											CreateBizRuleFile(BizRuleXMLFileContent,fileName+".xml");
					    	 			}
					    	 		}
						  	}
	}

     private String ChangeBatchNumber(String BizRuleXMLFileContent, String fileName) {
    	 BizRuleXMLFileContent=BizRuleXMLFileContent.replaceAll("E0001_P_VETADR_A_H", fileName);
			return BizRuleXMLFileContent.trim();
	}

     //Working fine of ReadingXML Template
	private String ReadXMLTemplate(String FileName) throws IOException {
		File xmlFile = new File(FileName);
			Reader fileReader = null;
				fileReader = new FileReader(xmlFile);
	  	
		  BufferedReader bufReader = new BufferedReader(fileReader);
		  	StringBuilder sb = new StringBuilder();  
		  		String line = bufReader.readLine();
		 
		  //reading xml template file
		  while( line != null)
		  { sb.append(line).append("\n"); 
		  line = bufReader.readLine();
		  }
		  	String BizRuleXMLFileContent = sb.toString(); 
		  		return BizRuleXMLFileContent;
	}
	
	private String CreateNewBizRuleFileXMLContent(String bizRuleXMLFileContent,String xmlTagColumn1) throws IOException {
		  	String [] dataRecords=xmlTagColumn1.split("\n");
		  		for(String record:dataRecords) {
		  			System.out.println(record);
		  				bizRuleXMLFileContent=ModifyXMLContentRecordWise(bizRuleXMLFileContent,record);
		  		}
			return bizRuleXMLFileContent.trim();
	}
	
	private String ModifyXMLContentRecordWise(String bizRuleXMLFileContent, String record) {
		String [] dataRecords=record.split("/");
		String LastRecord=null;
			for(String records:dataRecords) 
					LastRecord=records;
			
		//System.out.println(LastRecord);
		  		//int ActualTagindex=record.indexOf("/");
		  		int equalToIndex=LastRecord.indexOf("=");
		  		String ActualTagToChange=LastRecord.substring(0,equalToIndex);
		  			String TagValue=LastRecord.substring(equalToIndex+1,LastRecord.length());
		  				System.out.println(ActualTagToChange);
		  					System.out.println(TagValue);
		  			bizRuleXMLFileContent=ApplyTagValueChangesInBizRuleFile(bizRuleXMLFileContent,ActualTagToChange,TagValue);
		return bizRuleXMLFileContent;
	}

	 
	private String ApplyTagValueChangesInBizRuleFile(String xml2String,String TargetTag,String tagValue) {
		int k=xml2String.indexOf("<"+TargetTag+">");
				int l=xml2String.indexOf("</"+TargetTag+">");
		
				String s="</"+TargetTag+">";
					int check=s.length();
							String SourceTag=xml2String.substring(k,l+check);
								if(tagValue.contains("MISSING"))
									TargetTag="";
								else if(tagValue.length()>0)
									TargetTag="<"+TargetTag+">"+tagValue+"</"+TargetTag+">";
								else
									TargetTag="</"+TargetTag+">";
		
		   xml2String=xml2String.replaceAll(SourceTag.trim(),TargetTag.trim());
		   	return xml2String;
	}

/*
	private String modifyXML(String xmlTagColumn1, String Value,String BatchNumber) throws IOException {
		File xmlFile = new File(FileName);
		  Reader fileReader = null;
		 
			fileReader = new FileReader(xmlFile);
		 
		  BufferedReader bufReader = new BufferedReader(fileReader);
		  StringBuilder sb = new StringBuilder();  
			String line = bufReader.readLine();
		 
		  while( line != null)
		  { sb.append(line).append("\n"); 
		  line = bufReader.readLine();
		  }
		  String xml2String = sb.toString(); 
		  	int TagsChanges=countNoOfLines(xmlTagColumn1);
		  		if(TagsChanges==2) {
		  			xml2String=ModifyTwoTags(xml2String,xmlTagColumn1,Value);
		  		}
		  		else if(xml2String.indexOf(xmlTagColumn1)!=-1){  
		  					xml2String=xml2String.replaceAll(xmlTagColumn1, Value);
		  					}
		  		xml2String=xml2String.replaceAll("E0001_P_VETADR_A_H", BatchNumber);
			return xml2String.trim();
	}
	private String ModifyTwoTags(String xml2String,String xmlTagColumn1,String Value) {
	int k=xmlTagColumn1.indexOf("\n");
	   String SourceTag1=xmlTagColumn1.substring(0, k);
	     String SourceTag2=xmlTagColumn1.substring(k+1, xmlTagColumn1.length());
	   
	   int v=Value.indexOf("\n");
	   if(v!=-1) {
		   String TargetTag1=Value.substring(0, v);
	   		 String TargetTag2=Value.substring(v+1, Value.length());
	   			xml2String=xml2String.replaceAll(SourceTag1.trim(), TargetTag1.trim());
	   				xml2String=xml2String.replaceAll(SourceTag2.trim(), TargetTag2.trim());
	   }else {
		 //  String TargetTag1=Value.substring(0, v);
	   			xml2String=xml2String.replaceAll(SourceTag1.trim(), Value.trim());
	   				xml2String=xml2String.replaceAll(SourceTag2.trim(), "");
	   }
		   
	return xml2String.trim();
}*/

	private void CreateBizRuleFile(String xml2String,String newFileName) throws IOException {
		 File file = new File("c://Data//VETBizRuleFiles//"+newFileName);
		 file.createNewFile();
		 System.out.println(file.getName()+ " file created");
		
		  FileWriter fw = new FileWriter(file);
		  		fw.write(xml2String);
		  				fw.close();
	   	    }
		
	private int countNoOfLines(String xmlTagColumn1) {
		String [] dataRecords=xmlTagColumn1.split("\n");
		
			for(String records:dataRecords)
				System.out.println(records);
		return 0;
		
	}

	
}
