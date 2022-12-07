package com.apolis.corejava.javastreams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsInterviewQuestions {
    public static void main(String[] args) {
        // ways to iterate through collection list in java 8

        List<String> notes= Arrays.asList("note1","note2","note3","note4","note5","note6");
        List<Notes> noteList= Arrays.asList(new Notes(1, "aa", 11),
                new Notes(3, "cc", 33),
                new Notes(4, "bb", 44),
                new Notes(2, "dd", 34),
                new Notes(5, "zz", 32));

        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));
        noteLst.add(new Notes(6, "note4", 66));

        notes.forEach(n->System.out.println(n));
        System.out.println("==============================================================");

        // find element in note using foreach
         notes.forEach(n->{
            if ("note3".equals(n)){
                System.out.println(n);
            }
        });
        System.out.println("==============================================================");

        // using streams and filter
        notes.stream()
                .filter(s->s.contains("note2"))
                .forEach(System.out::println);
        System.out.println("==============================================================");

        notes.forEach(System.out::println);
        System.out.println("==============================================================");

//        How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?

//        Optional.ofNullable(noteList)
//                .orElse(Collections::emptyList)
//                .stream().filter(Objects::nonNull)
//                .map(note->Notes::getTagName)
//                .forEach(System.out::println);
//        System.out.println("==============================================================");

//        How to sort collections in java 8?
        noteList.sort((n1,n2)-> n1.getId()- n2.getId());
        noteList.forEach(n->System.out.println(n));
        System.out.println("==============================================================");

//        How to user map to convert object into Uppercare in java 8?

        List<String> uppperCaseList= notes.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppperCaseList);
        System.out.println("==============================================================");

//        How to convert a list of objects to a Map in java 8 by handling duplicate keys?

        Map<String, Long> notesRecords = noteLst.stream().collect(
                Collectors.toMap(Notes::getTagName, Notes::getTagId,
                        (oldValue, newValue) -> oldValue
                )
        );
        System.out.println(notesRecords);
        System.out.println("==============================================================");


//        How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
        Map<String, Long> notesRecords2 = noteLst.stream()
                .sorted(Comparator.comparingLong(Notes::getTagId).reversed()) // sorting is based on TagId 55,44,33,22,11
                .collect(
                        Collectors.toMap(Notes::getTagName, Notes::getTagId,
                                (oldValue, newValue) -> oldValue, // consider old value 44 for dupilcate key
                                LinkedHashMap::new           // it keeps order
                        )
                );

        System.out.println("Notes : " + notesRecords2);
        System.out.println("==============================================================");

//        Converting primitive array to List
    int[] nums={2,4,7,2,6,8,9};
    List<Integer> numsConvert= Arrays.stream(nums).boxed().collect(Collectors.toList());
    System.out.println(numsConvert);

//        Sorting an array in decending order

    int[] sortedArray= Arrays.stream(nums).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
    System.out.println(sortedArray);
        System.out.println("==============================================================");



    }
}

class Notes{
    int id;
    String tagName;
    long tagId;

    public int getId() {
        return id;
    }

    public String getTagName() {
        return tagName;
    }

    public long getTagId() {
        return tagId;
    }

    public Notes(int id, String tagName, long tagId) {
        this.id = id;
        this.tagName = tagName;
        this.tagId = tagId;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", tagName='" + tagName + '\'' +
                ", tagId=" + tagId +
                '}';
    }
}
