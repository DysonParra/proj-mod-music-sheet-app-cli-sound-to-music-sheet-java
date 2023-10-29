/*
 * @fileoverview    {Application}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev;

import com.project.dev.soundtomusicsheet.creator.MeasureCreator;
import com.project.dev.soundtomusicsheet.processor.NoteProcessor;
import com.project.dev.soundtomusicsheet.struct.MusicSheet;
import com.project.dev.soundtomusicsheet.struct.symbol.Measure;
import com.project.dev.soundtomusicsheet.struct.symbol.Note;
import com.project.dev.soundtomusicsheet.struct.symbol.Tempo;
import com.project.dev.soundtomusicsheet.writer.MusicSheetFileWriter;

/**
 * TODO: Description of {@code Application}.
 *
 * @author Dyson Parra
 * @since 11
 */
public class Application {

    /**
     * Entrada principal del sistema.
     *
     * @param args argumentos de la linea de comandos.
     */
    public static void main(String[] args) {
        /*
         * -
         * XmlFile xmlFile = new
         * XmlFile("C:\\Users\\Guindos\\Desktop\\Application\\Sheets\\Tori.xml", true);
         * //System.out.printf("%d\n", xmlFile.validateXml()); MusicSheet xmlSheet =
         * xmlFile.convertToMusicSheet(); xmlSheet.printMusicSheet();
         */

 /*
         * -
         * MeasureEraser meaureEraser = new MeasureEraser();
         * meaureEraser.deleteSeparationMeasures(xmlSheet); xmlSheet.printMusicSheet();
         */

 /*
         * -
         * NoteProcessor noteProcessor = new NoteProcessor();
         * noteProcessor.convertDivisionsToThirtyTwo(xmlSheet); xmlSheet.printMusicSheet();
         * //noteProcessor.uniteTies(xmlSheet);
         */

 /*
         * -
         * MeasureCreator measureCreator = new MeasureCreator();
         * measureCreator.addSeparationMeasures(xmlSheet); xmlSheet.printMusicSheet();
         */
        //MusicSheetFileWriter writer = new MusicSheetFileWriter();
        //writer.writeMusicSheetToXmlFile(sheet);

        /*
         * -
         * MusicSheet sheet = new MusicSheet(440.0f);
         *
         * sheet.addSymbol(new Measure(1, 4, 4, "G", 2, 0, 0), sheet.getLast(), true);
         * sheet.addSymbol(new Tempo(60), sheet.getLast(), true); sheet.setMinVolume(10.0f);
         *
         * sheet.addSymbol(new Sound(440 , (8192.0/44100.0), ( 1.0)), sheet.getLast(), true);
         * sheet.addSymbol(new Sound(4500, (8192.0/44100.0), (12.0)), sheet.getLast(), true);
         * sheet.addSymbol(new Sound(853 , (8192.0/44100.0), ( 6.0)), sheet.getLast(), true);
         * sheet.addSymbol(new Measure(1, 2, 2, "G", 2, 0, 0), sheet.getLast(), true);
         * sheet.addSymbol(new Tempo(120), sheet.getLast(), true); sheet.addSymbol(new Measure(1, 2,
         * 2, "G", 2, 0, 0), sheet.getLast(), true);
         *
         * sheet.addSymbol(new Sound(853 , (8192.0/44100.0), (11.0)), sheet.getLast(), true);
         * sheet.addSymbol(new Sound(853 , (8192.0/44100.0), (11.0)), sheet.getLast(), true);
         * sheet.addSymbol(new Sound(853 , (8192.0/44100.0), (11.0)), sheet.getLast(), true);
         * sheet.addSymbol(new Sound(853 , (8192.0/44100.0), (11.0)), sheet.getLast(), true);
         *
         * sheet.addSymbol(new Sound(440 , (8192.0/44100.0), ( 1.0)), sheet.getLast(), true);
         * sheet.addSymbol(new Sound(4500, (8192.0/44100.0)*5, (12.0)), sheet.getLast(), true);
         * sheet.addSymbol(new Sound(853 , (8192.0/44100.0)*4, ( 6.0)), sheet.getLast(), true);
         * sheet.addSymbol(new Measure(1, 2, 2, "G", 2, 0, 0), sheet.getLast(), true);
         * sheet.addSymbol(new Tempo(120), sheet.getLast(), true); sheet.addSymbol(new Sound(440 ,
         * (8192.0/44100.0)*3, ( 1.0)), sheet.getLast(), true); sheet.addSymbol(new Sound(4500,
         * (8192.0/44100.0)*2, (12.0)), sheet.getLast(), true); sheet.addSymbol(new Sound(853 ,
         * (8192.0/44100.0), ( 6.0)), sheet.getLast(), true); //sheet.printMusicSheet();
         *
         * SoundProcessor soundProcessor = new SoundProcessor();
         * soundProcessor.convertSoundsToNotes(sheet); //sheet.printMusicSheet();
         *
         * NoteProcessor noteProcessor = new NoteProcessor(); noteProcessor.uniteNotes(sheet);
         * sheet.printMusicSheet();
         */
 /*
         * -
         * NoteEraser noteEraser = new NoteEraser(); noteEraser.deleteRestsAtStart(sheet);
         * noteEraser.deleteRestsAtEnd(sheet); sheet.printMusicSheet();
         */

 /*
         * -
         * xmlSheet.addMusicSheet(sheet); //sheet.addMusicSheet(xmlSheet);
         * xmlSheet.printMusicSheet(); sheet.printMusicSheet(); //noteProcessor.uniteTies(sheet);
         * //sheet.printMusicSheet();
         */
        MusicSheet sheet = new MusicSheet(440.0f);
        sheet.setMinVolume(10.0f);

        sheet.addSymbol(new Measure(1, 4, 4, "G", 2, 0, 1), sheet.getLast(), true);
        sheet.addSymbol(new Tempo("quarter", 115), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 64, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("B", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("B", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("A", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("G", "0", "5", 48, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("G", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("F", "1", "5", 32, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("E", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("F", "1", "5", 32, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("G", "0", "5", 64, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("B", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("B", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("A", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("G", "0", "5", 48, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("G", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("A", "0", "5", 32, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("D", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("C", "0", "6", 32, 1, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("B", "0", "5", 64, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("E", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("E", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("F", "1", "5", 16, 0, 0, false), sheet.getLast(), true);

        sheet.addSymbol(new Tempo("quarter", 115), sheet.getLast(), true);
        sheet.addSymbol(new Note("C", "0", "3", 22, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("C", "0", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 33, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("C", "0", "3", 33, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("C", "0", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 22, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("G", "0", "2", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 33, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("G", "1", "2", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 99, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("A", "1", "7", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 33, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("D", "0", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 22, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("C", "1", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 88, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("G", "1", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("A", "0", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("G", "1", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("A", "0", "3", 33, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("G", "1", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 44, 0, 0, false), sheet.getLast(), true);

        sheet.addSymbol(new Measure(1, 2, 4, "G", 2, 0, 0), sheet.getLast(), true);
        sheet.addSymbol(new Tempo("half", 60), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 77, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("C", "0", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("D", "0", "3", 22, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("E", "0", "3", 22, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("F", "0", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 22, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("A", "1", "2", 22, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("B", "0", "2", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("B", "0", "2", 22, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 33, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("C", "1", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("D", "0", "3", 22, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("D", "0", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("C", "1", "3", 11, 0, 0, false), sheet.getLast(), true);
        sheet.addSymbol(new Note("0", "0", "0", 176, 0, 0, false), sheet.getLast(), true);

        sheet.printMusicSheet();

        NoteProcessor noteProcessor = new NoteProcessor();
        //noteProcessor.convertDivisionsToThirtyTwo(sheet);                       // Pasa sheetAux a divisions = 32.
        noteProcessor.divideNotes(sheet);                                         // Divide las notas.
        sheet.printMusicSheet();

        MeasureCreator measureCreator = new MeasureCreator();
        measureCreator.addSeparationMeasures(sheet);
        sheet.printMusicSheet();

        sheet.refreshListNumbers();
        sheet.printMusicSheet();

        MusicSheetFileWriter writer = new MusicSheetFileWriter();
        writer.writeMusicSheetToXmlFile(sheet);

        /*
         * -
         * noteProcessor.divideNotes(sheet); sheet.printMusicSheet();
         *
         * MeasureCreator measureCreator = new MeasureCreator();
         * measureCreator.addSeparationMeasures(sheet); sheet.printMusicSheet();
         */

 /*
         * -
         * sheet.addSymbol(new Measure( 1, 4, 4, " G", 2, 0, 1), sheet.getLast(), true);
         * sheet.addSymbol(new Tempo(115), sheet.getLast(), true); sheet.addSymbol(new Note(" 0",
         * "0", "0", 32, 0, 0, false), sheet.getLast(), true); sheet.addSymbol(new Measure( 2, 4, 4,
         * " G", 2, 0, 1), sheet.getLast(), true); sheet.addSymbol(new Tempo(115), sheet.getLast(),
         * true); sheet.addSymbol(new Note(" B", "0", "5", 54, 0, 0, false), sheet.getLast(), true);
         * sheet.addSymbol(new Note(" A", "0", "5", 26, 0, 0, false), sheet.getLast(), true);
         * sheet.addSymbol(new Note(" F", "1", "5", 16, 0, 0, false), sheet.getLast(), true);
         *
         * sheet.addSymbol(new Note(" G", "0", "5", 54, 0, 0, false), sheet.getLast(), true);
         * sheet.addSymbol(new Note(" F", "1", "5", 32, 0, 0, false), sheet.getLast(), true);
         * sheet.addSymbol(new Note(" E", "0", "5", 16, 0, 0, false), sheet.getLast(), true);
         * sheet.addSymbol(new Note(" F", "1", "5", 16, 0, 0, false), sheet.getLast(), true);
         *
         * sheet.printMusicSheet();
         */
    }
}
