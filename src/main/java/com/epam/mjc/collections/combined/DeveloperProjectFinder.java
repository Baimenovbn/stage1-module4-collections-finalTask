package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        ArrayList<String> projectsForDeveloper = new ArrayList<>(projects.values().size());

        projects.forEach((project, developers) -> {
            if (developers.contains(developer)) {
                projectsForDeveloper.add(project);
            }
        });
        System.out.println(projectsForDeveloper);

        projectsForDeveloper.sort((p1, p2) -> {
            if (p1.length() > p2.length()) {
                return -1;
            } else if (p1.length() < p2.length()) {
                return 1;
            } else {
                return Integer.compare(0, p1.compareTo(p2));
            }
        });

        return projectsForDeveloper;
    }
}
