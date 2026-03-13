package ru.govno.client.utils.Managers;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class AJN {
    private final String u;
    private String c;
    private String us;
    private String au;
    private boolean tts;
    private final List<RGs> embeds = new ArrayList<RGs>();

    public AJN(String u) {
        this.u = u;
    }

    public void setAu(String au) {
        if (au != null) {
            this.au = au;
        }
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setU(String u) {
        this.us = u;
    }

    public void setA(String a) {
        this.au = a;
    }

    public void setT(boolean tts) {
        this.tts = tts;
    }

    public void addE(RGs embed) {
        this.embeds.add(embed);
    }

    public void snd() {
    }

    public static class RGs {
        private String title;
        private String description;
        private String url;
        private Color color;
        private Footer footer;
        private Thumbnail thumbnail;
        private Image image;
        private Author author;
        private final List<Field> fields = new ArrayList<Field>();

        public String getTitle() {
            return this.title;
        }

        public String getDescription() {
            return this.description;
        }

        public String getUrl() {
            return this.url;
        }

        public Color getColor() {
            return this.color;
        }

        public Footer getFooter() {
            return this.footer;
        }

        public Thumbnail getThumbnail() {
            return this.thumbnail;
        }

        public Image getImage() {
            return this.image;
        }

        public Author getAuthor() {
            return this.author;
        }

        public List<Field> getFields() {
            return this.fields;
        }

        public RGs setTitle(String title) {
            this.title = title;
            return this;
        }

        public RGs setDescription(String description) {
            this.description = description;
            return this;
        }

        public RGs setUrl(String url) {
            this.url = url;
            return this;
        }

        public RGs setColor(Color color) {
            this.color = color;
            return this;
        }

        public RGs setFooter(String text, String icon) {
            this.footer = new Footer(text, icon);
            return this;
        }

        public RGs setThumbnail(String url) {
            this.thumbnail = new Thumbnail(url);
            return this;
        }

        public RGs setImage(String url) {
            this.image = new Image(url);
            return this;
        }

        public RGs setA(String name, String url, String icon) {
            this.author = new Author(name, url, icon);
            return this;
        }

        public RGs addF(String name, String value, boolean inline) {
            this.fields.add(new Field(name, value, inline));
            return this;
        }

        private class Footer {
            private final String text;
            private final String iconUrl;

            private Footer(String text, String iconUrl) {
                this.text = text;
                this.iconUrl = iconUrl;
            }

            private String getText() {
                return this.text;
            }

            private String getIconUrl() {
                return this.iconUrl;
            }
        }

        private class Thumbnail {
            private final String url;

            private Thumbnail(String url) {
                this.url = url;
            }

            private String getUrl() {
                return this.url;
            }
        }

        private class Image {
            private final String url;

            private Image(String url) {
                this.url = url;
            }

            private String getUrl() {
                return this.url;
            }
        }

        private class Author {
            private final String name;
            private final String url;
            private final String iconUrl;

            private Author(String name, String url, String iconUrl) {
                this.name = name;
                this.url = url;
                this.iconUrl = iconUrl;
            }

            private String getName() {
                return this.name;
            }

            private String getUrl() {
                return this.url;
            }

            private String getIconUrl() {
                return this.iconUrl;
            }
        }

        private class Field {
            private final String name;
            private final String value;
            private final boolean inline;

            private Field(String name, String value, boolean inline) {
                this.name = name;
                this.value = value;
                this.inline = inline;
            }

            private String getName() {
                return this.name;
            }

            private String getValue() {
                return this.value;
            }

            private boolean isInline() {
                return this.inline;
            }
        }
    }
}
