package com.danbi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class menu {

    private manager manager = new manager();
    private Scanner sc = new Scanner(System.in);

    public void menu(){

        menu:
        while (true){

            System.out.println("========== 메뉴 ==========");
            System.out.println("1 노래 추가");
            System.out.println("2 노래 전체 조회");
            System.out.println("3 정렬 조회");
            System.out.println("4 가수명 검색");
            System.out.println("5 곡명 검색");
            System.out.println("6 노래 삭제");
            System.out.println("0. 프로그램 종료");


            System.out.print("메뉴 선택하세요");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    add();
                    break;
                case 2:
                    select();
                    break;
                case 3:
                    sortMenu();
                    break;
                case 4:
                    artistSearch();
                    break;
                case 5:
                    titleSearch();
                    break;
                case 6:
                    remove();
                    break;
                case 0:
                    System.out.println("프로그램을 종료.");
                    break menu;
                default:
                    System.out.println("번호를 다시 입력해주세요.");
                    break;

            }
        }
    }

    public void add(){
        System.out.println("노래 추가");
        System.out.print("가수 입력하세요.");
        String artist = sc.nextLine();
        System.out.print("제목 입력하세요.");
        String title = sc.nextLine();

        manager.add(new MusicDTO(artist, title));
    }

    public void select(){
        System.out.println("노래 전체 조회");
        List<MusicDTO> musicList = manager.select();

        if (!musicList.isEmpty()) {
            for (MusicDTO music : musicList) {
                System.out.println(music);
            }
        } else {
            System.out.println("목록이 없습니다.");
        }
    }

    public void sortMenu() {
        System.out.println("정렬");
        System.out.println("1. 가수명 오름차순");
        System.out.println("2. 곡명 오름차순");
        System.out.println("3. 가수명 내림차순");
        System.out.println("4. 곡명 내림차순");
        System.out.print("메뉴 선택하세요.");
        int menu = sc.nextInt();

        sort(menu);
    }

    public void sort(int menu){
        System.out.println("정렬 조회");

        List<MusicDTO> musicList = manager.select();

        if (musicList.isEmpty()) {
            System.out.println("목록이 없습니다.");
            return;
        }

        ArrayList<MusicDTO> list = new ArrayList<>();
        list.addAll(musicList);

        if (menu == 1){
            list.sort(new Comparator<MusicDTO>() {
                @Override
                public int compare(MusicDTO o1, MusicDTO o2) {
                    return o1.getArtist().compareTo(o2.getArtist());
                }
            });
        } else if (menu == 2) {
            list.sort(new Comparator<MusicDTO>() {
                @Override
                public int compare(MusicDTO o1, MusicDTO o2) {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
            });
        } else if (menu == 3) {
            list.sort(new Comparator<MusicDTO>() {
                @Override
                public int compare(MusicDTO o1, MusicDTO o2) {
                    return o2.getArtist().compareTo(o1.getArtist());
                }
            });
        } else if (menu == 4) {
            list.sort(new Comparator<MusicDTO>() {
                @Override
                public int compare(MusicDTO o1, MusicDTO o2) {
                    return o2.getTitle().compareTo(o1.getTitle());
                }
            });
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    public void artistSearch(){
        System.out.println("가수명으로 검색");
        System.out.print("가수명 입력하세요. ");
        List<MusicDTO> searchList = manager.artistSearch(sc.nextLine());

        if (!searchList.isEmpty()) {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void titleSearch() {
        System.out.println("곡명으로 검색");
        System.out.print("곡명 입력하세요. ");
        List<MusicDTO> searchList = manager.titleSearch(sc.nextLine());

        if (!searchList.isEmpty()) {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }


    public void remove() {
        System.out.println("곡 삭제");
        System.out.print("삭제할 곡의 id 입력하세요.");
        if (manager.remove(sc.nextInt())) {
            System.out.println("삭제 되었습니다.");
        } else {
            System.out.println("삭제할 곡을 찾지 못했습니다.");
        }
        sc.nextLine();
    }

}
